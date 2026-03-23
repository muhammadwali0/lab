## Program to create a class named `Flyer` with a method `fly` that prints a flying message. Create a class named `Swimmer` with a method `swim` that prints a swimming message. Create a derived class `Superhero` that inherits from both `Flyer` and `Swimmer`. Create an object of the `Superhero` class and call both methods.


class Flyer:
    def fly(self) -> str:
        return "flying..."


class Swimmer:
    def swim(self) -> str:
        return "swimming..."


class Superhero(Flyer, Swimmer):
    pass


thor = Superhero()
print(f"Thor is {thor.fly()}")
print(f"Thor is {thor.swim()}")
