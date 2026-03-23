## Program to print n Fibonacci numbers 

n = int(input("Enter a number: "))

i = 0
j = 1


if n >= 1:
    print(i)

if n >= 2:
    print(j)

if n>=3:
    for x in range(n - 2):
        k = i + j
        print(k)
        i = j
        j = k

