#!/usr/bin/env bash
#script that accepts a first and last name as arguments and prints the full name

if [[ -z "$1" || -z "$2" ]]; then
  echo "error: argument(s) not supplied or empty" >&2
  exit 1
else
  echo "Your full name is $1 $2"
fi
