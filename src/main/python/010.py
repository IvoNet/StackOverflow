#!/usr/bin/env python
#  -*- coding: utf-8 -*-

def check_age():
    try:
        return int(input("What is your age? "))
    except NameError:
        print("Must be a number")
        return check_age()

if __name__ == '__main__':
    # print(check_age())


    # list1 = [[1,'a'],[2,'b'],[3,'c']]
    # list2 = ['I','II','III']
    # list3 = [[1,'a','I'],[2,'b','II'],[3,'c','III']]
    # list1.append(list2)
    # print(list1)

    a=[1,2,3]
    a += [4]
    a.append(6)
    print a
