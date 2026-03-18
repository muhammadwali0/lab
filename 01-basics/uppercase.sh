#!/usr/bin/env bash
# script that pipes the output of echo into tr to convert text to uppercase

echo "$@" | tr "[:lower:]" "[:upper:]"
