#!/usr/bin/env bash
# script that exits with code 0 on success and 1 on failure based on whether an argument was passed

if [[ -n "$1" ]]; then
  exit 0
else
  exit 1
fi
