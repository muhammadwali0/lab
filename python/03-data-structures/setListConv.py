## Program to convert a set into a list then convert it back to a set after applying list methods

setN = {i for i in range(1,6)}
lstN = list(setN)

lstN.append(6)

setN = set(lstN)
print(setN)
