## Program to define a function that returns another function


def square(x):
    """This function calculates the square"""
    return x**2


def integerSquare(x):
    """This function calculates the square of only integers"""
    if type(x) is int:
        return square(x)


print(integerSquare(5))
print(integerSquare("apple"))
