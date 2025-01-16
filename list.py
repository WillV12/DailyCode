import random
listSize = random.randint(1, 15)
numlist = []


for i in range(1, listSize + 1):
    numlist.append(i)

print("Length: ", listSize)

if len(numlist) > 1:
    randIndex = random.randint(0, listSize-1)
else:
    randIndex = 0
print("Number removed: ", numlist[randIndex])
numlist.remove(numlist[randIndex])
print("Cut list: ", numlist)

count = 1
if len(numlist) == 0:
    numlist.append(1)
else:
    for i in range(0, len(numlist)):
        
        if numlist[i] == count:
            if listSize != len(numlist) and count == len(numlist):
                numlist.append(listSize)
                break
            count += 1
            continue
        else:
            numlist.insert(i, count)
            
        count += 1

print("\nComplete list: ", numlist)
