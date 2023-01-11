numArr = list(input())
sum = 0
for i in range(len(numArr)):
    sum += int(numArr[i]) ** 5
print(sum)