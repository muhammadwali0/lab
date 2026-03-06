## Program to write a function that lets you write to a list of string to a file

import os


def write(filename, content=[]):
    if os.path.isfile(filename):
        state = "File already exists and was truncated."
    elif not os.path.isfile(filename):
        state = "File didn't exist so it was created."

    with open(filename, "w") as file:
        file.writelines(content)

    return state


names = ["Ali\n", "Sara\n", "Ahmed\n", "Hassan\n"]
print(write("output.txt", names))
