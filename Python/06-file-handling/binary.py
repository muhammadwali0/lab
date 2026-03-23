## Program to write a function that reads a binary file and writes its contents to another binary file named

import os


def copybin(filename):
    if os.path.isfile(filename):
        with open(filename, "rb") as file:
            content = file.read()
        with open(f"copy_{filename}", "wb") as file:
            file.write(content)


copybin("image.bin")
