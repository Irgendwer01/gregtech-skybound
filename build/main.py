#!/usr/bin/env python3

"""build client & server bundles"""

import argparse
import hashlib
import json
# if there is a problem with building, please let Irgendwer01 know
import os
import shutil
import subprocess
import sys

import requests


def parse_args():
    parser = argparse.ArgumentParser(prog="build", description=__doc__)
    parser.add_argument("--sha", action="store_true", help="append git hash to zips")
    parser.add_argument("--name", type=str, help="append name to zips")
    parser.add_argument("--retries", type=int, default=3, help="download attempts before failure")
    parser.add_argument("--clean", action="store_true", help="clean output dirs")
    parser.add_argument("--dev_build", action="store_true",
                        help="makes a folder with all the files symlinked for development. probally only works on linux")
    return parser.parse_args()


def build(args):
    modlist = []
    basePath = os.path.normpath(os.path.realpath(__file__)[:-7] + "..")
    copyDirs = ["/groovy", "/resources", "/config", "/mods", "/structures"]
    modURLlist = []
    modClientOnly = []
    if args.clean:
        shutil.rmtree(basePath + "/buildOut/client/overrides", ignore_errors=True)
        shutil.rmtree(basePath + "/buildOut/server", ignore_errors=True)
        shutil.rmtree(basePath + "/mods", ignore_errors=True)
        sys.exit(0)
    sha = ""
    if args.sha:
        try:
            p = subprocess.run(["git", "rev-parse", "--short", "HEAD"], capture_output=True, cwd=basePath)
            sha = p.stdout.strip().decode("utf-8")
        except Exception as e:
            print("could not determine git sha, skipping")
    with open(basePath + "/manifest.json") as file:
        manifest = json.load(file)
    cachepath = os.path.join(basePath, "buildOut", "modcache")

    def mkdirs(path):
        try:
            os.makedirs(path)
        except Exception as e:
            print("%s exists, skipping" % (path))

    mkdirs(basePath + "/buildOut/client/overrides")
    mkdirs(basePath + "/buildOut/server")
    mkdirs(basePath + "/mods")
    mkdirs(cachepath)  # /buildOut/modcach
    # if we downloaded mods before, add them to the cache
    prev = basePath + "/buildOut/server/mods"
    cached = 0
    if os.path.isdir(prev):
        for f in os.listdir(prev):
            # don't waste time copying mods to the cache that are already there
            if os.path.exists(os.path.join(cachepath, f)):
                continue
            cached += 1
            shutil.copy2(os.path.join(prev, f), os.path.join(cachepath, f))
    if cached > 0:
        print("cached %d mod downloads in %s" % (cached, cachepath))
    for dir in copyDirs:
        try:
            shutil.copytree(basePath + dir, basePath + "/buildOut/client/overrides" + dir)
        except Exception as e:
            print("Directory exists, skipping")
    print("directories copied to buildOut/client")
    archive = "buildOut/client"
    if sha:
        archive = "%s-%s" % (archive, sha)
    shutil.copy(basePath + "/manifest.json", basePath + "/buildOut/client/manifest.json")
    shutil.make_archive(archive, "zip", basePath + "/buildOut/client")
    print('client zip "%s.zip"  made' % (archive))
    print("done")


if __name__ == "__main__":
    build(parse_args())
