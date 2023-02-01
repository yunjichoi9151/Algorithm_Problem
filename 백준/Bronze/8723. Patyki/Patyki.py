a, b, c = map(int, input().split())
if a == b and b == c and a == c:
    print('2')
elif a * a + b * b == c * c or b * b + c * c == a * a or a * a + c * c == b * b:
    print('1')
else:
    print('0')