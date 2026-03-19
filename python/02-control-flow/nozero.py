## Program to print the sum of inputted numbers that terminates when 0 is inputted

i = 1
sum = 0

while i == 1:
    number = float(input("Enter a number: "))
    sum+=number
    if number == 0:
        print("Sum:", sum)
        break

