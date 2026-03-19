## Program to print a 3x3 matrix using a nested tuple and print a specific element from it 

matrix = ((1, 2, 3), (4, 5, 6), (7, 8, 9))

print("Matrix:")
for i in range(3):
    for j in range(3):
        print(matrix[i][j], end = " ")
    print("\n")

print("Element at 2nd row and 3rd coloumn:", matrix[1][2])

