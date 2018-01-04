#!/usr/bin/env python
#  -*- coding: utf-8 -*-

list = [('coin unit', 9.0), ('normal margin requirements', 8.5), ('futures industry', 8.2),
        ('wild cryptocurrency market', 7.333333333333334), ('biggest financial institutions', 6.833333333333334),
        ('futures market', 1.0), ('biggest banks', 0.5), ('cryptocurrency frenzy', 0.5)]

new = [x for x in list if x[1] > 1.0]
print new