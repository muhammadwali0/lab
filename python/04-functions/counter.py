## Program to define a function that maintains state between calls using a mutable default argument and should keep track of how many times it has been called


def counter(count={"Count": 0}):
    count["Count"] += 1
    return count


for i in range(10):
    print(counter())
