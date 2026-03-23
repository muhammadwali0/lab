## Proram to define a function that uses a context manager to write a list of integers to a file


def addToFile(path, List):
    """This function writes a list of integers to a file"""
    if not List or type(List) is not list:
        return None
    for elements in List:
        if type(elements) is not int:
            return None
    with open(path, "w") as f:
        f.writelines("\n".join(map(str, List)))
    return "Done"


emptylist = list()
integers = [1, 2, 3, 4, 5, 6, 7, 8, 9, "a"]
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
print(addToFile("addToFile.txt", numbers))
