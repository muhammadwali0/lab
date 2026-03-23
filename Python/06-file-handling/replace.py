## Program to create a function that replaces all occurences of a word in a file


def replace(old, new, filename):
    with open(filename, "r+") as file:
        lines = file.readlines()
        newLines = [line.replace(old, new) for line in lines]
        file.seek(0)
        file.truncate()
        file.writelines(newLines)


replace("Hi", "Bye", "data.txt")
