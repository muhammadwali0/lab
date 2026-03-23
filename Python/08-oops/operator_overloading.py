## Program to create a class with attributes and overload an operator to add two objects. Create objects of the class and test the operator overloading.


class Vector:
    def __init__(self, x: float, y: float) -> None:
        self.x = x
        self.y = y

    def __add__(self, other: "Vector") -> "Vector":
        return Vector(self.x + other.x, self.y + other.y)

    def __str__(self) -> str:
        return f"Vector({self.x}, {self.y})"


v1 = Vector(2, 4)
v2 = Vector(3, 6)
print(v1 + v2)
