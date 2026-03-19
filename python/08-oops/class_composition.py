## Program to Create a class with attributes and create a class that has that class object as its attribute


class Address:
    def __init__(self, street: str, city: str, zipcode: int) -> None:
        self.street = street
        self.city = city
        self.zipcode = zipcode

    def __str__(self) -> str:
        return (
            f"Address(street={self.street}, city={self.city}, zipcode={self.zipcode})"
        )


class Person:
    def __init__(self, name: str, address: Address) -> None:
        self.name = name
        self.address = address


my_address = Address("Block B", "Karachi", 75050)
me = Person("Wali", my_address)
print(me.address)
