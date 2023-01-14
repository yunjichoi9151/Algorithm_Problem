t1, m1, t2, m2 = map(int, input().split())
m1 += t1 * 60
m2 += t2 * 60
if (m1 > m2):
    m2 += 24 * 60
diff = m2 - m1
print(diff, diff // 30)