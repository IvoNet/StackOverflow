#!/bin/sh
exec apache2-foreground &
exec redis-server &