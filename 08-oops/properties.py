## Program to create a class with private attributes and use properties to get and set these attributes and create an object of the class and test the properties.


class Rectangle:
    def __init__(self, length: float, width: float) -> None:
        self.__length = length
        self.__width = width

    @property
    def length(self) -> float:
        return self.__length

    @property
    def width(self) -> float:
        return self.__width

    @length.setter
    def length(self, value: float) -> None:
        if value <= 0:
            raise ValueError("Length cannot be negative.")
        self.__length = value

    @width.setter
    def width(self, value: float) -> None:
        if value <= 0:
            raise ValueError("Width cannot be negative.")
        self.__width = value


laptop = Rectangle(9.5, 14)
print(laptop.width)
laptop.length = 10
print(laptop.length)
