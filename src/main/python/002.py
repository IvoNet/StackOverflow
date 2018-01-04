#!/usr/bin/env python
#  -*- coding: utf-8 -*-



import numpy as np


def test_run():
    # a = np.array(((32, 5, 5, 6, 234, 2, 6, 754, 5), (356, 3, 4, 126, 56, 56, 68)))
    a = np.array((21, 2, 3, 4, 5, 6, 7, 8))

    for b in a:
        print b.mean()
    print a

    print type(a)

    mean = a.mean()
    print (mean)


if __name__ == "__main__":
    test_run()
