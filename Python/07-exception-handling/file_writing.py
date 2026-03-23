## Program to write a function that attempts to write a list of strings to a file. Use try, except, and finally blocks to handle IOError and ensure the file is properly closed.

from typing import List


def safe_file_write(filename: str, lines: List[str]) -> None:
    try:
        with open(filename, "w") as file:
            file.writelines(lines)

    except IOError as ie:
        print(f"ERROR: {ie.strerror}")

    finally:
        print("Done.")


safe_file_write(
    "file.txt",
    ["Hi\n", "Will these lines be allowed on the file?\n", "Let's hope for the best."],
)
