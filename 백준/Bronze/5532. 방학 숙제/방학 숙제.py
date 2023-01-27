l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())

if (a / c) > (b / d):
    if a % c == 0:
            print(l - (a // c))
    else:
            print(l - (a // c + 1))
else:
    if b % d == 0:
            print(l - (b // d))
    else:
            print(l - (b // d + 1))