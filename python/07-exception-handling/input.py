## Program to write a function that prompts the user to enter an integer. Use try, except, and finally blocks to handle ValueError if the user enters a non-integer value and print an appropriate message.


def inputInt():
    try:
        int(input("Enter an integer: "))

    except ValueError:
        print("ERROR: non-integer value was inputted")

    except Exception:
        print("ERROR: an unexpected error occurred")

    finally:
        print("Execution Completed")


inputInt()
