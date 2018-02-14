#!/usr/bin/env python
#  -*- coding: utf-8 -*-

import subprocess

if subprocess.call(["git", "ls-remote","--heads","origin", "master"]):
    print("OK")
else:
    print("Not OK")
