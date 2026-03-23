## Program to create a base class named `Person` with attributes `name` and `age`. Create a derived class named `Employee` that inherits from `Person` and adds an attribute `employee_id`. Create an object of the derived class and print its attributes.


class Person:
    def __init__(self, name: str, age: int) -> None:
        self.name = name
        self.age = age


class Employee(Person):
    def __init__(self, name: str, age: int, employee_id: int) -> None:
        super().__init__(name, age)

        self.employee_id = employee_id


developer = Employee("Ali", 20, 12345)
print(developer.name)
print(developer.age)
print(developer.employee_id)
