import sys
input = sys.stdin.readline
n, m = map(int, input().split())
numArr1 = []
numArr2 = []
for i in range(n):
    numArr1.append(list(map(int, input().split())))
for i in range(n):
    numArr2.append(list(map(int, input().split())))
for i in range(n):
    for j in range(m):
        print(numArr1[i][j] + numArr2[i][j], end = " ")
    print()