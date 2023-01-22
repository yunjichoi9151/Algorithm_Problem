a1, p1 = map(int, input().split())
r1, p2 = map(int, input().split())
print("Slice of pizza" if a1 * p2 > r1 * r1 * 3.1415926535 * p1 else "Whole pizza")