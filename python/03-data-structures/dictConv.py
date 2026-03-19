## Program to create a dict and then convert it into a list

num = {i: i**2 for i in range(1, 6)}
numList = list()

for key, value in num.items():
    numList.append((key, value))

print(numList)
