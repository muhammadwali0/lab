## Program to check wether the set is a subset or a superset of another set 

set1 = {i for i in range(1,6)}
set2 = {i for i in range(1,4)}

print(set2.issubset(set1))
print(set1.issuperset(set2))

