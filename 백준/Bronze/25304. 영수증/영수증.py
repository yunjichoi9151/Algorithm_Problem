x = int(input())
n = int(input())
sum = 0
for i in range(n):
    a, b = map(int, input().split())
    sum += a * b
print("Yes" if sum == x else "No")