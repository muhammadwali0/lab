## Program to create a new dictionary using dictionary filtering on old dictionary

num = {i: i**2 for i in range(1, 11)}

evenNum = {key: value for key, value in num.items() if key % 2 == 0}
print(evenNum)
