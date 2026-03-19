## Program to remove and edit elements of a list of first ten positive integer

list = [1,2,3,4,5,6,7,8,9,10]
print("Original List: ", list)

for i in [2,4,6]:
    list.remove(i+1)
print("After 2nd, 4th and 6th index removed:", list)

list.insert(5, 99)
print("After adding 99 in 5th index:", list)

