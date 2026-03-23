## Program to print even numbers from 1 to inputted number using for loop

number = int(input("Enter a positive number: "))

if number <= 0:
    print("Not a positive number.")

else:
    for i in range(number):
        if (i+1)%2 == 0:
            print(i+1)
