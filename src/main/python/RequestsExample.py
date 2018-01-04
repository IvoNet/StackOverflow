#!/usr/bin/env python
#  -*- coding: utf-8 -*-



import requests
headers = {"User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:51.0) Gecko/20100101 Firefox/51.0", 'Accept': 'application/json; charset=utf-8'}
page = requests.get("http://stats.nba.com/stats/boxscoreplayertrackv2/?GameID=0021700300", headers=headers)
print page.json()
