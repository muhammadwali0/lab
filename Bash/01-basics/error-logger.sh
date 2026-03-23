#!/usr/bin/env bash
# script that redirects an error message from stderr to a file called error.log

error_message="error: no argument was passed"

if [[ -z "$1" ]]; then
  echo "$error_message" 2>&1 | tee -a error.log
  exit 1
else
  exit 0
fi
