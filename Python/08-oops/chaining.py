## Program to create a class with methods. Each method should return the object itself to allow method chaining. Create an object and chain multiple method calls.


class Calculator:
    def __init__(self, number: int | float) -> None:
        self.number = number

    def add(self, opnum: int | float) -> "Calculator":
        self.number += opnum
        return self

    def subtract(self, opnum: int | float) -> "Calculator":
        self.number -= opnum
        return self

    def multiply(self, opnum: int | float) -> "Calculator":
        self.number *= opnum
        return self

    def divide(self, opnum: int | float) -> "Calculator":
        self.number /= opnum
        return self


calc = Calculator(2)
print(calc.add(8).multiply(28).divide(47).subtract(12).number)
