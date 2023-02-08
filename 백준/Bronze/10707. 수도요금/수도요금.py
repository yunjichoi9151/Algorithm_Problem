a = int(input())
b = int(input())
c = int(input())
d = int(input())
p = int(input())

x = a * p
if p > c:
    y = b + (p - c) * d
else:
    y = b
    
print(x if x < y else y)