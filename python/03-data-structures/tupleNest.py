## Program to create a nested tuple and print each element

tpl = ((1, 2, 3, 4), (5, 6, 7, 8), (9, 10, 11, 12), (13, 14, 15, 16))

for i in tpl:
    for j in i:
        print(j, end = " ")
    print("\n")
