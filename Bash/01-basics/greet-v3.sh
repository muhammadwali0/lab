#!/usr/bin/env bash
# script with a function called greet that takes a name and prints a greeting

greet() {
  echo "Hello, $*"
}

greet "$*"
