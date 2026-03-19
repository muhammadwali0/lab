## Program to create a class with a class variable and each time an object is created, increment the count add a method to get the current count


class Counter:
    count = 0

    def __init__(self) -> None:
        Counter.count += 1

    def get_count(self) -> int:
        return Counter.count


first_count = Counter()
second_count = Counter()
print(Counter.count)
