n, w, h, l = map(int, input().split())
print((w // l) * (h // l) if n >= (w // l) * (h // l) else n)