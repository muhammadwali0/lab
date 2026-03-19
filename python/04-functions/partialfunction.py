## Program to create a function using functools.partial function that multiplies its input by 2

import functools


def multiply(a, b):
    return a * b


multiplyBy2 = functools.partial(multiply, 2)

print(multiplyBy2(5))
