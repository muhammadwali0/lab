num1 = float(input("Enter a number: "))
num2 = float(input("Enter another number: "))
print("Calculator: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division")
choice = input("Select option (1-4): ")

if choice == '1':
    sum = num1 + num2
    print("The sum of", num1, "and", num2, "is", sum)

elif choice == '2':
    diff = num1 - num2
    print("The difference between", num1, "and", num2, "is", diff)

elif choice == '3':
    prod = num1 * num2
    print("The product of", num1, "and", num2, "is", prod)

elif choice == '4':
    if num2 != 0:
        quot = num1 / num2
        print("The division of", num1, "by", num2, "is", quot)
    else:
        print("Math Error")

else:
    print("Syntax Error")
