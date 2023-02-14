k = int(input())
sum = 0
for i in range(k):
    n, s, d = map(int, input().split())
    for j in range(n):
        d_i, v_i = map(int, input().split())
        if (s * d) >= d_i:
            sum += v_i
    print("Data Set ", (i + 1), ":", sep = '')
    print(sum)
    print()
    sum = 0