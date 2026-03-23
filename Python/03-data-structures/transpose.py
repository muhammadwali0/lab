## Program to print a 3x3 matrix and then transpose it

matrix = [[1,2,3,], [4,5,6], [7,8,9]]

print("Original Matrix:")

for i in matrix:
    for j in i:
        print(j, end = " ")
    print("\n")

print("Transposed Matrix:")
for i in range(3):
    for j in matrix:
        print(j[i], end = " ")
    print("\n")
