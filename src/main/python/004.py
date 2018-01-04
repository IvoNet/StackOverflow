#!/usr/bin/env python
#  -*- coding: utf-8 -*-
NUMBER_FILE = "/Users/ivonet/dev/StackOverflow/src/main/python/004.txt"


def writeInt(filename, integer):
    with open(filename, "w") as fo:
        fo.write("%d" % integer)


def readInt(filename):
    with open(filename, "r") as fi:
        return fi.read()


def main():
    writeInt(NUMBER_FILE, 42)
    print readInt(NUMBER_FILE)


if __name__ == '__main__':
    main()
