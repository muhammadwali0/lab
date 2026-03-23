## Program to remove duplicate elements from the set

randNum = {28, 93, 15, 15, 17, 24, 13, 76, 5, 29, 7, 13, 53}

for i in randNum:
    randNum.remove(i)
    if i in randNum:
        pass
    else:
        randNum.add(i)

print(randNum)
