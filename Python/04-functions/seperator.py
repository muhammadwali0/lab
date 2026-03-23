## Program to define a function that takes a list of mixed data types (integers, strings, and floats) and returns three lists containing integers, strings, and floats


def seperator(lst):
    """This function seperates different data types into different lists"""
    if type(lst) is not list:
        return None

    intList = [x for x in lst if type(x) is int]
    strList = [x for x in lst if type(x) is str]
    floatList = [x for x in lst if type(x) is float]
    temp = 0

    if intList:
        temp += 1
    if strList:
        temp += 2
    if floatList:
        temp += 4

    if temp == 0:
        return None
    if temp == 1:
        return intList
    if temp == 2:
        return strList
    if temp == 4:
        return floatList
    if temp == 3:
        return intList, strList
    if temp == 6:
        return strList, floatList
    if temp == 5:
        return intList, floatList
    else:
        return intList, strList, floatList


testList = [0, "qwerty", 3.142, 1, "apple", 2.678, 3, "ball", 5.294]

print(seperator(testList))
