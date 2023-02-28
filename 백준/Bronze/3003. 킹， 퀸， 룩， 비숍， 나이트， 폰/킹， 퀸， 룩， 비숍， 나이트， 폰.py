a = [1, 1, 2, 2, 2, 8]
piece = list(map(int, input().split()))
for i in range(6):
    print(a[i] - piece[i], end = ' ')