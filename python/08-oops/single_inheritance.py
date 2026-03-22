## Program to create a base class with attributes and a derived class that inherits from base class and adds an attribute and an object of the child class and print its attributes.


class Animal:
    def __init__(self, name: str, species: str) -> None:
        self.name = name
        self.species = species


class Dog(Animal):
    def __init__(self, name: str, species: str, breed: str) -> None:
        super().__init__(name, species)
        self.breed = breed


my_pet = Dog("Bruno", "Canis lupus familiaris", "Norwegian Lundehund")

print(
    f"My pet's name is {my_pet.name}, it's species is {my_pet.species} and it's breed is {my_pet.breed}."
)
