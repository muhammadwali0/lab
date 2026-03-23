## Program to create 2 sets and then perform common set operations on them

set1 = {i for i in range (1,6)}
set2 = {i for i in range(1, 11) if i % 2 == 0}

print("Set 1:", set1)
print("Set 2:", set2)

print("Union:", set1.union(set2))
print("Intersection:", set1.intersection(set2))
print("Difference:", set1.difference(set2))
print("Symmetric Difference:", set1.symmetric_difference(set2))

