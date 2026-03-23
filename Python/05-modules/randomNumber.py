## Program to create a list of 5 random integers between 1 and 50 and shuffle it

import random

lst = [random.randint(1, 50) for element in range(5)]
print("List:", lst)
random.shuffle(lst)
print("Shuffled List:", lst)
