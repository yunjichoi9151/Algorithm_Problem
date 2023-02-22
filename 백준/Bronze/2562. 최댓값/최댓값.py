numArr = []
for i in range(9):
    numArr.append(int(input()))
print(max(numArr))
print(numArr.index(max(numArr)) + 1)