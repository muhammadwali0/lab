## Program to create a class named `A` with a method `show` that prints a message. Create two derived classes `B` and `C` that inherit from `A` and override the `show` method. Create a class `D` that inherits from both `B` and `C`. Create an object of the `D` class and call the `show` method. Observe the method resolution order.


class A:
    def show(self) -> str:
        return "This is A"


class B(A):
    def show(self) -> str:
        return "This is B"


class C(A):
    def show(self) -> str:
        return "This is C"


class D(B, C):
    pass


d = D()
print(d.show())
print(D.__mro__)
