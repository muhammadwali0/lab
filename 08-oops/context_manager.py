## Program to create a class that implements the context manager protocol to open and close a file. Use this class to read the contents of a file.

from typing import IO


class FileManager:
    def __init__(self, filename: str, mode: str) -> None:
        self.filename = filename
        self.mode = mode

    def __enter__(self) -> IO:
        self.file = open(self.filename, self.mode)
        return self.file

    def __exit__(self, exc_type, exc_val, exc_tb) -> None:
        self.file.close()


with FileManager("test.txt", "w") as file:
    file.write("Hello, World!")

with FileManager("test.txt", "r") as file:
    print(file.read())
