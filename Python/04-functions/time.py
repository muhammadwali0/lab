## Program to create a function that calculates the time it took for another function to execute

import time


def duration(function):
    """This is a decorator function"""

    def timeCalc(*args, **kwargs):
        """This is a wrapper function calculates the time a function took to execute"""
        initial = time.time()
        result = function(*args, **kwargs)
        final = time.time()
        print(f"{function.__name__} took {final - initial} seconds to execute")
        return result

    return timeCalc


@duration
def complexFunction(x):
    """This function does something complex and we have to pretend it is meaningful"""
    temp = 0
    for i in range(x * 100):
        temp += i * x
    return temp


print(complexFunction(999999))
