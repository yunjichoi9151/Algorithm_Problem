import math
w, h = map(int, input().split())
print((w + h) - (math.sqrt(w * w + h * h)))