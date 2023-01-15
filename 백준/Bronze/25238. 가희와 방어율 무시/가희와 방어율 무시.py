a, b = map(int, input().split())
print(1 if (a * (100 - b) / 100) < 100 else 0)