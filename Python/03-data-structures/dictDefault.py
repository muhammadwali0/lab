## Program to create a default dictionary wiht lists then print it after adding some elements to it

from collections import defaultdict

defDict = defaultdict(list)
defDict["a"].append(85)
defDict["b"].append(7)
defDict["c"].append(21)
print(defDict)
