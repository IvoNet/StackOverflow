#!/usr/bin/env python
#  -*- coding: utf-8 -*-


    def bubble_sort(seq):
        changed = True
        while changed:
            changed = False
            for i in range(len(seq) - 1):
                if seq[i] > seq[i + 1]:
                    seq[i], seq[i + 1] = seq[i + 1], seq[i]
                    changed = True
        print(seq)
        return None


    if __name__ == '__main__':
        # l = list(range(0, 10, -1)) # Wring
        l = list(range(10, 0, -1))
        bubble_sort(l)
