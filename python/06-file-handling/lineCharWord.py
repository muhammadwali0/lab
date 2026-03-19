## Program to create a function to count lines, words and characteres in a file

import os


def lineWordChar(filename):
    if os.path.isfile(filename):
        with open(filename, "r") as file:
            content = file.readlines()
        lines = len(content)
        words = sum(len(line.split()) for line in content)
        chars = sum(len(line) for line in content)
        return lines, words, chars


file = "stats.txt"
l, w, c = lineWordChar(file)
print(f"There are {l} lines, {w} words and {c} characters in '{file}'")
