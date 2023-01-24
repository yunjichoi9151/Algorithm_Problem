n, h, v = map(int, input().split())
if n / 2 > h:
    h = n - h
if n / 2 > v:
    v = n - v
print(int(4 * (h * v)))