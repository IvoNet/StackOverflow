#!/usr/bin/env python
#  -*- coding: utf-8 -*-

dates = [
    "order_date",
    "payment_date",
    "shipped_date"
]

for d in dates:
    if d in payload:
       payload[d] = self._get_formatted_date(payload[d])