#!/bin/bash
I=1
while [ $I < 6 ];
 do
 j=1
 i=`expr $i +1`
 echo ""
 while [ $j -le $i ]
   do
   echo $i
   j=`expr $j+1`
 done
done
echo "enter code here"


