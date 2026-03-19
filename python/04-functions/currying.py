## Program to define a curried function that takes three arguments and returns their product


def multiply(a):

    def product(b):

        def factor(c):
            return a * b * c

        return factor

    return product


print(multiply(2)(2)(3))
