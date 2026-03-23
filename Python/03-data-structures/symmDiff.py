## Program to update first set with the symmetric difference of both sets 

set1 = {i for i in range(1,8)}
set2 = {i for i in range(4,11)}

set1.symmetric_difference_update(set2)

print(set1)
