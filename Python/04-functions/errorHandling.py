## Program to define a function that takes a list of integers and returns their average and also handle any errors that occur and return None in such cases


def average(integers):
    """This function calculates average of all elements in a list"""

    if type(integers) is not list:
        return None

    for integer in integers:
        if type(integer) is not list or float:
            return None

    terms = 0
    total = sum(integers)

    for integer in integers:
        terms += 1

    if terms == 0:
        return None

    return total / terms


def sum(List):
    """This function sums all the elements of a list"""
    total = 0

    for element in List:
        total += element

    return total


numbers = [1.23, "apple", 3.56, 4.56, 5.23, 6.78, 7.20, 8.49, 9.23]
print(average(numbers))
