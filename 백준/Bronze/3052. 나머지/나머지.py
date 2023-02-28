numArr = []
for i in range(10):
    n = int(input())
    numArr.append(n % 42)   
numArr = set(numArr)
print(len(numArr))