a, b, c = map(int, input().split())
d = int(input())
print(int((a + (b + (c + d) / 60) / 60) % 24), int((b + (c + d) / 60) % 60), int((c + d) % 60))