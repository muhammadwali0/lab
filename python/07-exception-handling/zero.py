## Program to write a function that takes two integers as input and returns their division. Use try, except, and finally blocks to handle division by zero and print an appropriate message.


def division(a, b):
    try:
        result = a / b
        print(result)

    except ZeroDivisionError as zde:
        print(f"ERROR: {zde}")

    except Exception as ex:
        print(ex)

    finally:
        print("Operation completed.")


num1 = int(input("Enter a number: "))
num2 = int(input("Enter another number: "))
division(num1, num2)
