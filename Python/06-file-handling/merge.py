## Program to write a function that merges the contents of multiple files into a single file
import os


def merge(*files):
    for filename in files:
        if os.path.isfile(filename):
            with open(filename, "r") as file:
                contents = file.readlines()
            with open("merged.txt", "a") as mfile:
                mfile.writelines(contents)


merge("data.txt", "destination.txt", "output.txt")
