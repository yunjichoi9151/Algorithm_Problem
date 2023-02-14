a, b = map(int, input().split())
c, d = map(int, input().split())
print(a + d if a + d < b + c else b + c)