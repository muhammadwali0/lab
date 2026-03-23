## Program to define a function that takes a filter function and a map function along with a list and should first filter the integers using the filter and then apply the map to the filtered integers


def filterAndMap(filterFunction, mapFunction, List):
    """This function is a high-order function that filters and maps your lists"""
    return mapFunction(filterFunction(List))


def onlyOdd(List):
    """This function filters a list for only odd numbers"""
    return [element for element in List if element % 2 != 0]


def squaredList(List):
    """This function squares each element of the list"""
    return [element**2 for element in List]


numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(filterAndMap(onlyOdd, squaredList, numbers))
