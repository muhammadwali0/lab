## Program to iterate over dicts to print key-value pairs

number = {x: x**2 for x in range(1, 11)}

for key, value in number.items():
    print(f"{key}: {value}")
