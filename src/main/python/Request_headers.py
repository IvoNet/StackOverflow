#!/usr/bin/env python
#  -*- coding: utf-8 -*-



import requests
from bs4 import BeautifulSoup
from lxml.html import fromstring

URL = "https://www.tomtom.com/en_gb/trafficindex/city/istanbul"

headers = {
    "Host": "www.neimanmarcus.com",
    "Connection": "keep-alive",
    "Content-Length": 106,
    "Pragma": "no-cache",
    "Cache-Control": "no-cache",
    "Accept": "*/*",
    "Origin": "http://www.neimanmarcus.com",
    "X-Requested-With": "XMLHttpRequest",
    "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36",
    "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
    "Referer": "http://www.neimanmarcus.com/Stuart-Weitzman-Reserve-Suede-Over-the-Knee-Boot-Black/prod179890262/p.prod",
    "Accept-Language": "en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4,fr;q=0.2,cs;q=0.2,zh-TW;q=0.2"
}

headers = {"User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:51.0) Gecko/20100101 Firefox/51.0",
           'Accept': 'application/json; charset=utf-8'}

headers = {"User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:51.0) Gecko/20100101 Firefox/51.0"}

page = requests.get(URL, headers=headers)
print(page.content)
tree = fromstring(page.content)

soup = BeautifulSoup(page.content, 'html.parser')

# print([type(item) for item in list(soup.children)])

html = list(soup.children)[2]

g_data = soup.find_all("div", {"class_": "big.ng-binding"})

congestion = tree.xpath(
    "/html/body/div/div[2]/div[2]/div[2]/section[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/text()")
print(congestion)
print(len(g_data))
