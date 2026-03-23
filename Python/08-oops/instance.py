## Program to create a base class named `Animal` and a derived class named `Cat`. Create objects of both classes and use the `isinstance` function to check the instance types.


class Animal:
    pass


class Cat(Animal):
    pass


tom = Cat()
jerry = Animal()

print(isinstance(tom, Animal))
print(isinstance(tom, Cat))
print(isinstance(jerry, Animal))
print(isinstance(jerry, Cat))
