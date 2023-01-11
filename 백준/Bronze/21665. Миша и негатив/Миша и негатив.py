n, m = map(int, input().split())
sum = 0
a = [input() for i in range(n)]
input()
b = [input() for i in range(n)]
for i in range(n):
    for j in range(m):
        if a[i][j] == b[i][j]:
            sum += 1
print(sum)