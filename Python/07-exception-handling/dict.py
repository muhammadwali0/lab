## Program to write a function that takes a dictionary and a key as input and returns the value associated with the key. Use try, except, and finally blocks to handle KeyError if the key is not found in the dictionary and print an appropriate message.


def inDict(dictionary, key):
    try:
        value = dictionary[key]

    except KeyError as ke:
        print(f"ERROR: {ke}")

    except Exception:
        print("An unexpected error occurred")

    finally:
        print("Operation Completed")

    return value


score = {"Ali": 2, "Ahmed": 5, "Sara": 1, "Hassan": 4}
print(inDict(score, "Sara"))
