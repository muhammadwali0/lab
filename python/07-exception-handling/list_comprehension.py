## Program to write a function that uses a list comprehension to convert a list of strings to integers. Use try, except, and finally blocks within the list comprehension to handle ValueError and print an appropriate message.

from typing import List


def string_to_integer(numbers: List[str]) -> List[int] | None:
    try:
        return [int(number) for number in numbers]

    except ValueError:
        print("ERROR: a string in the list cannot be converted into an integer")

    except Exception as ex:
        print(f"ERROR: {ex}")

    finally:
        print("Done.")


print("Result:", string_to_integer(["1", "2", "3", "4", "five"]))
