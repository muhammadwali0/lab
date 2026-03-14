## Program to add a method to the class that prints a message


class Car:
    def __init__(self, make: str, model: str, year: int) -> None:
        self.year = year
        self.model = model
        self.make = make

    def start_engine(self) -> str:
        return f"{self.make} started"


my_car = Car("Lexus", "LS 500 Heritage Edition", 2026)
print(my_car.start_engine())
