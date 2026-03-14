## Program to create a class named `Student` with attributes `name` and `age`. Use a constructor to initialize these attributes. Create an object of the class and print its attributes.


class Student:
    def __init__(self, name: str, age: int) -> None:
        self.name = name
        self.age = age


cr = Student("Ali", 20)
print(cr.name)
print(cr.age)
