## Program to sort a list in ascending and descending order and remove duplicates

list = [7,142,39,856,23,91,504,18,672,305,44,999,61,278,12,430,76,91,44,201]
print("Original list:", list)

list.sort()
print("Sorted in Ascneding order:", list)

print("Sorted in Descending order:", [i for i in list[::-1]])

for i in list:
    if list.count(i) > 1:
        for j in range((list.count(i)) - 1):
            list.remove(i)

print("Without any duplicate element:", list)


