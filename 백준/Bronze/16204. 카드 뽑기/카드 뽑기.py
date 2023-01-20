n, m, k = map(int, input().split())
print(k + n - m if m >= k else m + n - k)