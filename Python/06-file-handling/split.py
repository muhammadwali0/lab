## Program to write a function that splits a large file into smaller files of 100 lines each.

import os


def split(filename):
    if os.path.isfile(filename):
        with open(filename, "r") as file:
            lines = file.readlines()

            if len(lines) > 100:
                if len(lines) % 100 != 0:
                    filecount = len(lines) // 100 + 1

                elif len(lines) % 100 == 0:
                    filecount = len(lines) // 100

                for i in range(filecount):
                    name, dot, extension = filename.rpartition(".")
                    with open(f"{name}{i + 1}{dot}{extension}", "w") as sepfile:
                        if i == filecount - 1:
                            sepfile.writelines(lines[i * 100 :])

                        elif i == 0:
                            sepfile.writelines(lines[:100])

                        else:
                            sepfile.writelines(lines[i * 100 : (i + 1) * 100])


split("large.txt")
