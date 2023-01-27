n = int(input())
k = int(input())
if n < 60 + k:
    print(n * 1500)
else:
    print((n - (60 + k)) * 3000 + (60 + k) * 1500)