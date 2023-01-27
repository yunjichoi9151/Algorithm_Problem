sum_one = 0
sum_two = 0
a = list(map(int, input().split()))
for i in range(3):
    if a[i] == 1:
        sum_one += 1
    elif a[i] == 2:
        sum_two += 1
print(1 if sum_one > sum_two else 2)