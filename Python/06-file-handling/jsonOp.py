## Program to write a function that reads a JSON file and prints its contents as a Python dictionary.

import json
import os


def jsonDict(filename):
    if os.path.isfile(filename):
        with open(filename, "r") as file:
            content = json.load(file)
            return content


print(jsonDict("data.json"))
