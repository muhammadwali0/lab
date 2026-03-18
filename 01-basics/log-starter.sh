#!/usr/bin/env bash
# script that writes "Logging started" to a log file and appends a second line to it

echo "Logging started" >file.log
echo "$@" >>file.log
