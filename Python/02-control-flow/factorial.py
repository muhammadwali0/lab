## Program to print factorial of inputted number using while loop

number = int(input("Enter a positive integer: "))
factorial = 1

while number != 0:
    factorial *= number
    number -= 1

if number == 0:
    print(factorial)
