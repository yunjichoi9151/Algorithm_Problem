a = int(input())
for i in range(1, a + 1):
    b, c = map(int, input().split())
    print("Case #%d: %d"%(i, b + c))