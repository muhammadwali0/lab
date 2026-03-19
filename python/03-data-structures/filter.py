## Program to filter a set into another set with only even numbers

numbers = {i for i in range(1,11)}

filteredSet = {i for i in numbers if i % 2 == 0}
print(filteredSet)
