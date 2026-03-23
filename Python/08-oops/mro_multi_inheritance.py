## Program to create a base class with a method. Create another base class with a method. Create a derived class that inherits from both classes. Create an object of the chils class and call both methods. In the child class, override a method to print a different message. Use the `super()` function to call the method of the base class.


class Walker:
    def walk(self) -> str:
        return "walking..."


class Runner:
    def run(self) -> str:
        return "running..."


class Athlete(Walker, Runner):
    def run(self) -> str:
        original = super().run()
        return f"slowly {original}"


teammate = Athlete()
print(f"Ali is {teammate.walk()}\nAli is {teammate.run()}")
