## Program to create a class with attributes and create an object of the class and print its attributes.


class Car:
    def __init__(self, make: str, model: str, year: int) -> None:
        self.year = year
        self.model = model
        self.make = make


my_car = Car("Lexus", "LS 500 Heritage Edition", 2026)
print(my_car.make)
print(my_car.model)
print(my_car.year)
