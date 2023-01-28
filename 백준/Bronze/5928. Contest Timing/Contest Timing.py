d, h, m = map(int, input().split())
if d == 11 and h == 11 and m < 11 or d == 11 and h < 11 or d < 11:
    print("-1")
else:
    if d == 11:
        print((h * 60 + m) - (11 * 60 + 11))
    else:
        print(((d - 12) * 24 * 60) + (12 * 60 + 49) + (h * 60 + m))