## Program to create a base class with attributes and a derived class that inherits from base class and adds an attribute and an object of the child class and print its attributes, in the child class, add a method and call the method.


class Animal:
    def __init__(self, name: str, species: str) -> None:
        self.name = name
        self.species = species


class Dog(Animal):
    def __init__(self, name: str, species: str, breed: str) -> None:
        super().__init__(name, species)
        self.breed = breed

    def __str__(self) -> str:
        return f"Type: Dog\nName: {self.name}\nSpecies: {self.species}\nBreed: {self.breed}"

    def bark(self) -> str:
        return "Woof! Woof!"


my_pet = Dog("Bruno", "Canis lupus familiaris", "Norwegian Lundehund")

print(
    f"My pet's name is {my_pet.name}, it's species is {my_pet.species} and it's breed is {my_pet.breed}. It says {my_pet.bark()}"
)
