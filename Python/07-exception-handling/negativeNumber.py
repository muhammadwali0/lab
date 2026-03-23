## Program to define a custom exception named `NegativeNumberError`. Write a function that raises this exception if a negative number is encountered in a list. Use try, except, and finally blocks to handle the custom exception and print an appropriate message.

from typing import List


class NegativeNumberError(Exception):
    pass


def negativeNumChecker(items: List[int | float]) -> None:
    for item in items:
        if item < 0:
            raise NegativeNumberError("less than zero")


try:
    negativeNumChecker([9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1])

except NegativeNumberError as nne:
    print(f"ERROR: {nne}")

except Exception as ex:
    print(f"ERROR: {ex}")

finally:
    print("Done")
