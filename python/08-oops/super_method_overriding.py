## Program to create a class named `Vehicle` with a method `start` that prints a starting message. Create a derived class `Car` that overrides the `start` method to print a different message. Use the `super()` function to call the `start` method of the `Vehicle` class. Create an object of the `Car` class and call the `start` method.


class Vehicle:
    def start(self) -> str:
        return "starting..."


class Car(Vehicle):
    def start(self) -> str:
        original = super().start()
        return f"Car is {original}"


mycar = Car()
print(mycar.start())
