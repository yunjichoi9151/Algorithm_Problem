a, b, c = map(int, input().split())
if a == b and b == c and c == a:
    print('*')
else:
    if a == b:
        print('C')
    if b == c:
        print('A')
    if c == a:
        print('B')