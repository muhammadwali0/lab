## Program to create a function that prints the lines of a file in reverse order

import os


def reverse(filename):
    if os.path.isfile(filename):
        with open(filename, "r") as file:
            lines = file.readlines()
        for line in lines[::-1]:
            print(line.strip("\n"))
    else:
        print(FileNotFoundError)


reverse("reverse.txt")
