#!/usr/bin/env python3
#  -*- coding: utf-8 -*-

# Python Program for implementation of
# Recursive Bubble sort


def bubble_sort(input_list):
    for idx, num in enumerate(input_list):
        try:
            if input_list[idx + 1] < num:
                input_list[idx] = input_list[idx + 1]
                input_list[idx + 1] = num
                bubble_sort(input_list)
        except IndexError:
            pass
    return input_list


if __name__ == '__main__':
    my_list = [100, 39, 2, 12, 42, 12, 90]
    bubble_sort(my_list)
    print(my_list)
