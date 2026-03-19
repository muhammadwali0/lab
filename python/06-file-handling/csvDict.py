## Program to write a function that reads a CSV file and prints its contents as a list of dictionaries

import csv
import os


def csvList(filename):
    if os.path.isfile(filename):
        with open(filename, "r") as file:
            content = csv.DictReader(file)
            return list(content)


print(csvList("data.csv"))
