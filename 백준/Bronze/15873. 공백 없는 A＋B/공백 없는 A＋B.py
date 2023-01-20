n = int(input())
if 100 > n:
    print(n // 10 + n % 10)
elif n % 10 == 0:
    print(n // 100 + 10)
else:
    print(n % 100 + 10)