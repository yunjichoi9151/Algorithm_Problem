a, b = map(int, input().split())
if a % 2 == 0 or b % 2 == 0:
    print('0')
else:
    print(b if (a > b) else a)