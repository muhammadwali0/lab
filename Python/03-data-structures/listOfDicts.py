## Program to sort a list of dictionaries in descneding order by the values of the dictionaries

students = [
    {"Name": "Ali", "Score": 30},
    {"Name": "Sara", "Score": 69},
    {"Name": "Asad", "Score": 100},
    {"Name": "Hira", "Score": 32},
    {"Name": "Raza", "Score": 63},
]

students.sort(key=lambda x: x["Score"], reverse=True)
print(students)
