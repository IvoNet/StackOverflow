#!/usr/bin/env python
#  -*- coding: utf-8 -*-


def format_time(value):
    t2 = str(value)
    if len(t2) == 5:
        return "0%s:%s:%s" % (t2[0], t2[1:3], t2[3:5])
    return "%s:%s:%s" % (t2[0:2], t2[2:4], t2[4:6])


print(format_time(60000))
print(format_time(120000))
print(format_time(233355))
