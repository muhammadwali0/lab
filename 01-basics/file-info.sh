#!/usr/bin/env bash
# script that prints its own filename, the current user, and the current directory

filename="${0##*/}"
echo "'$USER' executed '$filename' in '${PWD}'"
