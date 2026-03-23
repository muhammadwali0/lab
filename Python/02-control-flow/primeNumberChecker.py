## Program to check if the inputted number is prime or not

number = int(input("Enter a positive integer: "))
is_prime = True

for i in range(2, number):
    if number % i == 0:
        is_prime = False
        break

if is_prime:
    print(number, "is a prime number.")

else:
    print(number, "is  not a prime number")

