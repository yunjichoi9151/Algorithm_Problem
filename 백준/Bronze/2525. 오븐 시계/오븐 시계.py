a, b = map(int, input().split())
c = int(input())
d = a * 60 + b + c;
h = int(d / 60);
m = d % 60;

if h > 23:
    h -= 24;

print(h, m)