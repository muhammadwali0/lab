## Program to write a function that performs nested exception handling


def reciprocal(number):
    try:
        integer = int(number)
        try:
            result = 1 / integer
            return result

        except ZeroDivisionError as zde:
            print(f"ERROR: {zde}")

        except Exception as ex:
            print(f"ERROR: {ex}")

    except ValueError as ve:
        print(f"ERROR: {ve}")

    except Exception as ex:
        print(f"ERROR: {ex}")

    finally:
        print("Task completed.")


num = "apple"

print("Result: ", reciprocal(num))
