n = int(input())
a, b = map(int, input().split())
print(a // 2 + b if n >= a / 2 + b else n)