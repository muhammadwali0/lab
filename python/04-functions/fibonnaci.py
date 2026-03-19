## Program to define a recursive function to calculate the nth Fibonacci number


def fibonacci(n):
    """This function calculates the nth factorial number"""
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


for num in range(10):
    print(fibonacci(num))
