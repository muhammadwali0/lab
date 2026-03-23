## Program to write a function that takes a list of integers and returns their sum. Use try, except, and finally blocks to handle TypeError if a non-integer value is encountered and print an appropriate message.


def sumInt(integers):
    result = 0

    try:
        for integer in integers:
            result += integer

    except TypeError:
        print("ERROR: non-integer encountered")

    except Exception as ex:
        print(ex)

    finally:
        print("Operation completed.")

    return result


numbers = [1, 2, 3, 4, 5, 6, 7, 8, "q", 10]
print(sumInt(numbers))
