#!/usr/bin/env python
#  -*- coding: utf-8 -*-


def find_index(val, seq):
    return seq.index(val)


def init_nested_list(size_outer, size_inner):
    cal = []
    for outer_index in range(size_outer):
        nested_list = []
        for inner_index in range(size_inner):
            nested_list.append("-")
        cal.append(nested_list)
    return cal


def book_slot(cal, days_labels, times_labels, day, time):
    pos1 = find_index(day, days_labels)
    desired_day = cal[pos1]
    pos2 = find_index(time, times_labels)
    if desired_day[pos2] is "X":
        print("We are sorry - that time is not available. Please try again.")
    else:
        print("Appointment is booked.")
        desired_day[pos2] = "X"


days_labels = ["Wednesday", "Thursday", "Friday"]
times_labels = ["9", "10", "11"]
cal = init_nested_list(len(days_labels), len(times_labels))
print("before", cal)
book_slot(cal, days_labels, times_labels, "Friday", "10")
print("after", cal)
book_slot(cal, days_labels, times_labels, "Friday", "10")
