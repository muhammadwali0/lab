## Program to check whether the input number is positive, odd, even, negative or zero

number = float(input("Enter a number: "))

if number>0:
    if number%2 == 0:
        print(number, "is a positive even number.")

    else:
        print(number, "is a positive odd number.")

elif number<0:
    print(number, "is a negative number.")

else:
    print("It is zero.")
