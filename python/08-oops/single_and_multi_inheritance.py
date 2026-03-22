## Program to create a base class named `Device` with an attribute `brand`. Create a derived class `Phone` that inherits from `Device` and adds an attribute `model`. Create another base class `Camera` with an attribute `resolution`. Create a derived class `Smartphone` that inherits from both `Phone` and `Camera`. Create an object of the `Smartphone` class and print its attributes.


class Device:
    def __init__(self, brand: str, **kwargs) -> None:
        self.brand = brand
        super().__init__(**kwargs)


class Phone(Device):
    def __init__(self, brand: str, model: str, **kwargs) -> None:
        super().__init__(brand=brand, **kwargs)
        self.model = model


class Camera:
    def __init__(self, resolution: int, **kwargs) -> None:
        self.resolution = resolution
        super().__init__(**kwargs)


class Smartphone(Phone, Camera):
    def __init__(self, brand: str, model: str, resolution: int) -> None:
        super().__init__(brand=brand, model=model, resolution=resolution)


my_phone = Smartphone("Google Pixel", "10 Pro XL", 50)
print(
    f"My phone is a {my_phone.brand} {my_phone.model} with camera resolution of {my_phone.resolution} MP."
)
