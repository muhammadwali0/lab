## Program to write a function that reads the contents of a file named `data.txt`. Use try, except, and finally blocks to handle file not found errors and ensure the file is properly closed.


def reader(filename):
    try:
        file = open(filename, "r")
        content = file.read()
        print(content)

    except FileNotFoundError as fnfe:
        print(f"ERROR: {fnfe}")

    except Exception as ex:
        print(f"ERROR: {ex}")

    finally:
        if "file" in locals():
            if not file.close():
                file.close()


reader("data.txt")
