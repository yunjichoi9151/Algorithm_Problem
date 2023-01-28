numArr = [i for i in range(1,31)]
for i in range(28):
    numArr.remove(int(input()))
print(*numArr,sep="\n")