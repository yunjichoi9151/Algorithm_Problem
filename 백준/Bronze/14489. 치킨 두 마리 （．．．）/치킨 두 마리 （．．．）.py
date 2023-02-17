a, b = map(int, input().split())
c = int(input())
print((a + b) - (c * 2) if ((a + b) >= c * 2) else a + b)