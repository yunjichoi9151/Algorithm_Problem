l, r = map(int, input().split())
if l == r and l != 0 and r != 0:
    print("Even", l * 2)
elif l == 0 and r == 0:
    print("Not a moose")
else:
    print("Odd", l * 2 if l > r else r * 2)