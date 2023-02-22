a = int(input())
b = int(input())

x = int(b / 100);
z = int(b % 10);
y = int((b - (x * 100 + z)) / 10)

print(a * z)
print(a * y)
print(a * x)
print(a * b)