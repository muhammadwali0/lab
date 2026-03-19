## Program to rotate the list by the number inputted by the user

num = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,21,22,23,24,25]
print("Original List:", num)

n = int(input("How many times do you want to rotate the list?\n"))

for i in range(n):
    poppedNum = num.pop()
    num.insert(0, poppedNum)

print(f"Here is the list after {n} rotations:", num);

