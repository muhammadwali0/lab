## Program to define a function that takes a list and a callback function and apply that function on all elements of that list


def fibonacci(n):
    """This function calculates the nth factorial number"""
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


cubed = lambda x: x**3


def onAll(function, lst):
    """This functon applies a function to all the elemnts of a list"""
    newLst = [function(element) for element in lst]
    return newLst


testList = [x for x in range(10)]

fibonnacciList = onAll(fibonacci, testList)
cubedList = onAll(cubed, testList)

print(fibonnacciList)
print(cubedList)
