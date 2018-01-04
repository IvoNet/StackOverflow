#!/usr/bin/env python
#  -*- coding: utf-8 -*-


if __name__ == '__main__':
    files = range(1, 100, 1) #your os.listdir() for simulation

    for i, x in enumerate(files):
        print i, i % 10
        if i % 10 == 0 or i % 10 == 9:
            print("Keeping : " + str(x))
        else:
            print("Deleting: " + str(x))
