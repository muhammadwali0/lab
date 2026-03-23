## Program to create a base class with a method. Create another base class with a method. Create a derived class that inherits from both classes. Create an object of the chils class and call both methods.


class Walker:
    def walk(self) -> str:
        return "walking..."


class Runner:
    def run(self) -> str:
        return "running..."


class Athlete(Walker, Runner):
    pass


teammate = Athlete()
print(f"Ali is {teammate.walk()}\nAli is {teammate.run()}")
