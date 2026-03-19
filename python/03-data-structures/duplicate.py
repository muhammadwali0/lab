## Program to find count of duplicate elements of a tuple and print it with the
## index of its first occurence

randNum = (1,8,3,6,9,9,8)
dupl = [i for i in randNum if randNum.count(i) > 1]

for i in dupl:
    if dupl.count(i):
        dupl.remove(i)


for i in dupl:
    print(f"{i} is a duplicate number appearing {randNum.count(i)} times with first occurence at index: {randNum.index(i)}")

