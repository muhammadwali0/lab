## Program to create a function that is a composite of two other functions f and g


def composite(f, g, x):
    """This function does composite of two functions"""
    return f(g(x))


def square(x):
    """This function squares the input number"""
    return x**2


def exponential(x):
    """This is an exponential function"""
    return 2.718**x


print(composite(exponential, square, 26))
