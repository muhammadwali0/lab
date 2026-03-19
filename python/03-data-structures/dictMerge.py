## Program to merge two dictionaries

dict1 = {x: x**2 for x in range(1, 6)}
dict2 = {x: x**3 for x in range(6, 11)}
merged_dict = {**dict1, **dict2}
print(merged_dict)
