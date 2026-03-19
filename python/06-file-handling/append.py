## Program to create a funciton that appends a string to a file

import os


def add(string, filename):
    if os.path.isfile(filename):
        with open(filename, "a") as file:
            file.write(string)
    elif not os.path.isfile(filename):
        with open(filename, "w") as file:
            file.write(string)


add("This is a test log entry", "logs.txt")
