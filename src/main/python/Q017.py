#!/usr/bin/env python
#  -*- coding: utf-8 -*-


        orig = [((' Spouse', ' Min.Edu', ' United-States'), 0.12281563834034581),

                        ((' Male',), 0.6692054912318418),

                        ((' United-States', ' Uni.Edu'), 0.1463714259390068)]

                new_list = [(x[0], len(x[0])) for x in orig ]
                print(new_list)