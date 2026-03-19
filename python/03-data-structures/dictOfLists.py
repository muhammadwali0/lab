## Program to create a dictionary containing lists

num = {i: [i * j for j in range(1, 6)] for i in range(1, 6)}
print(num)
