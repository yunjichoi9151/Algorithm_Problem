x, l, r = map(int, input().split())
if l < x and x < r:
    print(x)
else:
    print(r if (abs(l - x) > abs(r - x)) else l)