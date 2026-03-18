#!/usr/bin/env bash
# script that prints its own filename, the current user, and the current directory

filename=$(basename "$0")
echo "'$USER' executed '$filename' in '$(pwd)'"
