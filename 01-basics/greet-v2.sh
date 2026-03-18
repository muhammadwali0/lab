#!/usr/bin/env bash
# script that accepts a name as an argument but falls back to "stranger" if none is given

if [[ -n "$@" ]]; then
  echo "Hello, $@"
else
  echo "Hello, stranger"
fi
