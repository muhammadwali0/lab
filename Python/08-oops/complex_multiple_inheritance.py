## Program to create a class named `Base1` with an attribute `a`. Create a class named `Base2` with an attribute `b`. Create a class named `Derived` that inherits from both `Base1` and `Base2` and adds an attribute `c`. Initialize all attributes using the `super()` function. Create an object of the `Derived` class and print its attributes.

from typing import Any


class Base1:
    def __init__(self, a: Any, **kwargs) -> None:
        self.a = a
        super().__init__(**kwargs)


class Base2:
    def __init__(self, b: Any, **kwargs) -> None:
        self.b = b
        super().__init__(**kwargs)


class Derived(Base1, Base2):
    def __init__(self, a: Any, b: Any, c: Any) -> None:
        super().__init__(a=a, b=b)
        self.c = c


test = Derived("foo", "bar", "baz")
print(test.a)
print(test.b)
print(test.c)
