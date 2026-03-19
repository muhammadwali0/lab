## Program to create a function that counts the word in a file


def wordcount(filename):
    with open(filename, "r") as file:
        lines = file.readlines()
        words = sum((len(line.split()) for line in lines))
    return words


file = "document.txt"
words = wordcount(file)
print(f"There are {words} words in '{file}'.")
