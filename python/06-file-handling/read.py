## Program to read from a file
import os


def read(filename):
    if os.path.isfile(filename):
        with open(filename, "r") as file:
            content = file.read()
        return content

    else:
        return FileNotFoundError


print(read("sample.txt"))
