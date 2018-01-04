#!/usr/bin/env python
#  -*- coding: utf-8 -*-

line = "[RUN #1 3%,   2 secs]  2 threads:        6673 ops,    3511 (avg:    3333) ops/sec, 3.60MB/sec (avg: 3.42MB/sec),  0.56 (avg:  0.59) msec latency"
# line = " ".join(line.split())
answer = line.split()
print answer[9], answer[16]


