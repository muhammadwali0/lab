## Program to convert a string into a dictionary with counts of each character's appearence

string = str(input("Enter a string: "))
count = {}

for x in string:
    if x in count:
        count[x] += 1
    else:
        count[x] = 1
print(count)
