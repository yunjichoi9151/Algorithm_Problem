l, p = map(int, input().split())
numArr= list(map(int, input().split()))

for i in range(len(numArr)):
    print(numArr[i] - l * p, end =" ")