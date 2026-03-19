## Program to create a function that prints infinite fibonacci numbers


def fibonacci(n):
    """This function calculates fibonacci numbers"""
    a, b = 0, 1

    for _ in range(n):
        a, b = b, a + b

    return a


def printFibonacci(limit=None):
    """This function prints fibonacci numbers"""
    i = 0

    while True:
        if limit is not None and i >= limit:
            break

        print(fibonacci(i))

        i += 1


printFibonacci(9)
