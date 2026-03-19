## Program to convert a dictionary to a JSON string
import json

bookD = {"Title": "1984", "Author": "George Orwell", "Year": 1948, "Genre": "Fiction"}

bookJ = json.dumps(bookD)
print(bookJ)
