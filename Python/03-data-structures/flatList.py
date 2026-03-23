## Program to flatten a nested list

nestList = [[1,2,3], [4,5,6], [7,8,9]]
print("Original List: ", nestList)

flatList = [j for i in nestList for j in i]
print("Flatenned List: ", flatList)

