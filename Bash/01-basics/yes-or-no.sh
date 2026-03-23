#!/usr/bin/env bash
# script that asks the user to confirm an action with y/n and prints the result

read -p "Do you want to quit the program (Y/n): " choice
if [[ -n "$choice" ]]; then
  if [[ "$choice" == "y" || "$choice" == "Y" ]]; then
    exit 0
  elif [[ "$choice" == "n" || "$choice" == "N" ]]; then
    echo "Why not?"
    exit 0
  else
    echo "error: invalid input" >&2
    exit 1
  fi
else
  exit
fi
