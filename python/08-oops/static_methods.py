## Program to create a class named `MathOperations` with a static method to calculate the square root of a number. Call the static method without creating an object.


class MathOperations:
    @staticmethod
    def square_root(number: float) -> float:
        return number ** (1 / 2)


print(MathOperations.square_root(4))
