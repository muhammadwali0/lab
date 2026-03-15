## Program to create an abstract base class with an abstract method and create derived classes that implement the method. Create objects of the derived classes and call the method.

from abc import ABC, abstractmethod
import math


class Shape(ABC):
    @abstractmethod
    def area(self) -> float:
        pass


class Circle(Shape):
    def __init__(self, radius: float) -> None:
        self.radius = radius

    def area(self) -> float:
        return math.pi * (self.radius**2)


class Square(Shape):
    def __init__(self, side: float) -> None:
        self.side = side

    def area(self) -> float:
        return self.side**2


coin = Circle(11.5)
bread = Square(110)

print(coin.area(), "mm")
print(bread.area(), "mm")
