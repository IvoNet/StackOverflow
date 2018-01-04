#!/usr/bin/env python
#  -*- coding: utf-8 -*-


# result = []
# a = [1,2,3,4,5,6,7]
# def f(x):
#     result.append(x**2)
# map(f, a)
# print(result)

result = []
a = [1,2,3,4,5,6,7]
def f(x):
    result.append(x**2)
map(f, a)
print(result)

result = []
a = [1,2,3,4,5,6,7]
def f(x):
    result.append(x**2)
for i in a:
    f(i)
print(result)

result = []
a = [1,2,3,4,5,6,7]
def f(x):
    result.append(x**2)
    return x**2
map(f, a)
print(result)           # >>> []
print(list(map(f,a)))   # >>> [1,2,3,4,5,6,7]