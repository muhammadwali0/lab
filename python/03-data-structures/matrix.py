## Program to build a 3x3 matrix and then print a specific number from its index

matrix = [[1,2,3], [4,5,6], [7,8,9]]

print("Matrix:")

for i in matrix:
    for j in i:
        print(j, end = " ")
    print("\n")

print("Element on the second row and third coloumn: ", matrix[1][2])
