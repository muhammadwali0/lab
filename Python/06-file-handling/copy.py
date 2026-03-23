## Program to create a function to copy contents of a file into another file


def copy(sourceFile, destinationFile):
    with open(sourceFile, "r") as source:
        content = source.read()
    with open(destinationFile, "w") as destination:
        destination.writelines(content)
    print(f"'{sourceFile}' copied to '{destinationFile}'.")


copy("source.txt", "destination.txt")
