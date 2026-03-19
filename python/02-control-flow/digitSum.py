## Program to print the sum of digits of the inputted number

number = input("Enter a number: ")
sum = 0

for i in number:
    sum += int(i)

print(sum)
