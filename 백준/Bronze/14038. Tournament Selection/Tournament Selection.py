count = 0
for i in range(6):
    s = input()
    if s == 'W':
        count += 1
if count == 0:
    print(-1)
elif count >= 5:
    print(1)
elif count >= 3:
    print(2)
else:
    print(3)