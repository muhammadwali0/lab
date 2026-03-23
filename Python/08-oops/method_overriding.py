## In the `Employee` class, override the `__str__` method to return a string representation of the object. Create an object of the class and print it.


class Person:
    def __init__(self, name: str, age: int) -> None:
        self.name = name
        self.age = age


class Employee(Person):
    def __init__(self, name: str, age: int, employee_id: int) -> None:
        super().__init__(name, age)
        self.employee_id = employee_id

    def __str__(self) -> str:
        return f"Employee(name={self.name}, age={self.age}, employee_id={self.employee_id})"


developer = Employee("Ali", 20, 12345)
print(developer)
