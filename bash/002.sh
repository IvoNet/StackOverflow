#!/usr/bin/expect

send "date +%d%m%y \n"
set date1 "$expect_out(buffer)"
puts "$date1"
expect "#"
#The output I'm getting is
#date +%d%m%y
#111217