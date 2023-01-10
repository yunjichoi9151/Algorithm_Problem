k = int(input())
tmp = 25 + k * 0.01
if tmp < 100:
    print(format(100.0, ".2f"))
elif tmp > 2000:
    print(format(2000.0, ".2f"))
else:
    print(format(tmp, ".2f"))