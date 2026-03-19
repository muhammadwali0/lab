## Program to write a function that attempts to read a file and handles any permission errors gracefully by printing an error message.


def reader(filename):
    try:
        with open(filename) as file:
            return file.read()
    except PermissionError:
        return "You do not have permission to read this file"
    except FileNotFoundError:
        return "The file does not exist"
    except Exception:
        return "Unexpected error occurred"


print(reader("file"))
