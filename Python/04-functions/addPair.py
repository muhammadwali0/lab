## Program to define a function that takes two arguments, one is a dictionary with a default value of an empty dictionary and it adds a new key-value pair to the dictionary and return it


def addKey(key, dictionary={}):
    """This function adds a key-value pair to the dictionary"""
    dictionary[key] = key
    return dictionary


print(
    addKey(
        12,
    )
)
testdict = {1: 2, 3: 4, 5: 6, 7: 8, 9: 10}
print(addKey(12, testdict))
print(addKey(3, testdict))
