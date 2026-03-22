## Program to create a base class with a method. Create another base class with a method. Create a derived class that inherits from both classes. Create an object of the chils class and call both methods. In the `Athlete` class, add an attribute `training_hours` and a method `train` that prints the training hours. Create an object of the class and call the method.


class Walker:
    def walk(self) -> str:
        return "walking..."


class Runner:
    def run(self) -> str:
        return "running..."


class Athlete(Walker, Runner):
    def __init__(self, training_hours: int | float) -> None:
        self.training_hours = training_hours

    def run(self) -> str:
        original = super().run()
        return f"slowly {original}"

    def train(self) -> str:
        return f"has trained for over {self.training_hours} hours."


teammate = Athlete(11.4)
print(f"Ali is {teammate.walk()}\nAli is {teammate.run()}\nAli {teammate.train()}")
