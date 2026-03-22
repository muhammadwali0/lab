## Program to create a class named `Person` with an attribute `name`. Create a class named `Employee` with an attribute `employee_id`. Create a derived class `Manager` that inherits from both `Person` and `Employee`. Use the `super()` function to initialize the attributes. Create an object of the `Manager` class and print its attributes.


class Person:
    def __init__(self, name: str, **kwargs) -> None:
        self.name = name
        super().__init__(**kwargs)


class Employee:
    def __init__(self, employee_id: int, **kwargs) -> None:
        self.employee_id = employee_id
        super().__init__(**kwargs)


class Manager(Person, Employee):
    def __init__(self, name: str, employee_id: int) -> None:
        super().__init__(name=name, employee_id=employee_id)


person1 = Manager("Ali", 12345)
print(
    f"The name of the manager is {person1.name} and his employee id is {person1.employee_id}."
)
