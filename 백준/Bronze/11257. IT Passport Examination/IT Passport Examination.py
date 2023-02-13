n = int(input())
for i in range(n):
    a, s, m, t = map(int, input().split())
    print(a, s + m + t, "PASS" if s + m + t >= 55 and s >= 35 * 0.3 and m >= 25 * 0.3 and t >= 40 * 0.3 else "FAIL")