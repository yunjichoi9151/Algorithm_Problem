n = int(input())
print("Gnomes:")
for i in range (n):
    a, b, c = map(int, input().split())
    if (a <= b and b <= c) or (c <= b and b <= a):
        print("Ordered")
    else:
        print("Unordered")