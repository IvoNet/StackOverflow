#!/usr/bin/env python
#  -*- coding: utf-8 -*-


test = "I can go shopping for shoes"


    def check_word_in_line(word, line):
        return " {} ".format(word) in line


    print(check_word_in_line("or", "I can go shopping or not")) //True
    print(check_word_in_line("or", "I can go shopping for shoes")) //False
