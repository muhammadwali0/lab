## Program to remove duplicates from a tuple by cinverting it into sets 

randNumTuple = (28, 93, 15, 15, 17, 24, 13, 76, 5, 29, 7, 13, 53)
randNum = set(randNumTuple)

for i in randNum:
    randNum.remove(i)
    if i in randNum:
        pass
    else:
        randNum.add(i)

randNumTuple = tuple(randNum)
print(randNumTuple)
