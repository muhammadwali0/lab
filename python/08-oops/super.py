## Program to create a base class named `Shape` with an attribute `color`. Create a derived class named `Circle` that inherits from `Shape` and adds an attribute `radius`. Use the `super()` function to initialize the attributes. Create an object of the `Circle` class and print its attributes.


class Shape:
    def __init__(self, color: str) -> None:
        self.color = color


class Circle(Shape):
    def __init__(self, color: str, radius: float) -> None:
        super().__init__(color)
        self.radius = radius


ball = Circle("red", 2.483)
print(f"The color of the ball is {ball.color} and the radius is {ball.radius}.")
