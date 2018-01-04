#!/usr/bin/env bash

    inotifywait -m $TEST_DIR -e create |
        while read path action file; do
            echo "Processing: '$path$file'"
            if [ ${file: -4} == ".jpg" ]
            then
                echo "Processing image..."
    #            your code here
            else
                echo "The file does not seem to be an image file... ignoring."
            fi
        done