## Program to define a function that takes a variable number of keyword arguments and returns a dictionary containing only those key-value pairs where the value is an integer


def intOnly(**kwargs):
    """This function creates a dictionary with only integer values"""
    ioDict = dict()
    for key, value in kwargs.items():
        if type(value) is int:
            ioDict[key] = value
    return ioDict


testDict = intOnly(one=2, qwerty=3, abc=4.142, xyz="xyz")
print(testDict)
