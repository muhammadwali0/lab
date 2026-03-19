## Program to create an intersection list containing only common elements of list A and B

listA = [635, 917, 38, 46]
listB = [27, 635, 46, 0]

interList = [i for i in listA if listA.count(i) > 0 and listB.count(i) > 0]

print("Elements common in both of the lists:", interList)
