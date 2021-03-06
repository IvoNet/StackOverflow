#!/usr/bin/env python
#  -*- coding: utf-8 -*-

    import subprocess

    def run_process(exe):
        'Define a function for running commands and capturing stdout line by line'
        p = subprocess.Popen(exe.split(), stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
        return iter(p.stdout.readline, b'')


    if __name__ == '__main__':
        commands = ["foo", "foofoo"]
        for command in commands:
            for line in run_process(command):
                print(line)
