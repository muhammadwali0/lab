## Program to swap keys and values in a dictionary

num = {i: i**2 for i in range(1, 6)}
newNum = {value: key for key, value in num.items()}
print(newNum)
