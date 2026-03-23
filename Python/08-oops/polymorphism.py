## Program to create a base class named `Bird` with a method `speak`. Create two derived classes `Parrot` and `Penguin` that override the `speak` method. Create a list of `Bird` objects and call the `speak` method on each object to demonstrate polymorphism.


class Bird:
    def speak(self) -> str:
        return "Bird is speaking."


class Parrot(Bird):
    def speak(self) -> str:
        return "Parrot is speaking."


class Penguin(Bird):
    def speak(self) -> str:
        return "Penguin is speaking."


def speak(items: list[object]) -> None:
    for item in items:
        if isinstance(item, Bird):
            print(item.speak())


eagle1 = Bird()
parrot1 = Parrot()
penguin1 = Penguin()
birds = [eagle1, parrot1, penguin1]

speak(birds)
