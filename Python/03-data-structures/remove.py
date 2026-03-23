## Program to remove each element one by one and print the set each time:

num = {i for i in range(1,11)}
print(num)

for i in range(len(num)):
    if len(num) == 1:
        print("{}")
        break

    num.pop()
    print(num)

