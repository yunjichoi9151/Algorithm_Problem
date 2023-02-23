n1, n2 = input().split()
n1 = int(n1[::-1])
n2 = int(n2[::-1])

if n1 > n2:
    print(n1)
else:
    print(n2)