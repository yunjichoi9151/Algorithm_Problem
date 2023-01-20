y1, m1, d1 = map(int, input().split())
y2, m2, d2 = map(int, input().split())
c = y2 - y1
b = c + 1
if (m1 == m2 and d1 <= d2) or (m1 < m2):
    a = y2 - y1
else:
    a = y2 - y1 - 1
print(a)
print(b)
print(c)