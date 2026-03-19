## Program to calculate minimum, maximum and sum of all the elements of a tuple

tpl = (1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
min = tpl[0]
max = tpl[0]
sum = 0

for i in tpl:
    if tpl[i] < min:
        min = tpl[i]

    if tpl[i] > max:
        max = tpl[i]

    sum += tpl[i]

print("Minimum:", min)
print("Maximum:", max)
print("Sum:", sum)
