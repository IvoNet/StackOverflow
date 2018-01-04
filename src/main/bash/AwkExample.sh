#!/usr/bin/env bash

# adds #DONE to the first line that does not have it.

#grep -nrv -m1 "#DONE" "$1" | awk -F  ":" '{print $2}' | xargs -I {}  awk 'FNR=={},FNR=={}{$3="#DONE"};1' "$1" >tmp && mv tmp "$1"

awk '!f && !/#DONE$/{ $0=$0 " #DONE"; f=1 }1' $1 >tmp && mv tmp "$1"