## Program to write a function that calls another function which may raise an exception

from typing import Any, Callable


def safe_function_caller(func: Callable, *args, **kwargs) -> Any:
    return func(*args, **kwargs)


def add(*args: int | float) -> int | float:
    total = 0
    for arg in args:
        total += arg

    return total


try:
    print("Result:", safe_function_caller(add, 1, 2, 3, 4, 5))

except Exception as ex:
    print(f"ERROR: {ex}")

finally:
    print("Done")
