## Program to write a function that takes a list and an index as input and returns the element at the given index

from typing import Any, List


def element(items: List[Any], n: int) -> Any:
    """
    Retrieve the element at a certain index from a list

    Args:
        items: list to retrieve element from
        n: index of the element

    Returns:
        element of the given index or none if the index is out of range

    Raises:
        index error if the index is out of range
    """
    try:
        return items[n]

    except IndexError as ie:
        print(f"ERROR: {ie}")

    except Exception:
        print("ERROR: an unexpected error occurred")


print("Result:", element(["a", "b", "c", "d", "e"], 9))
