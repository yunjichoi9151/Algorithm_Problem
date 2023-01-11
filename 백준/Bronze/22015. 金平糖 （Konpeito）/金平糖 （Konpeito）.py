arr = list(map(int, input().split()))
max = 0
for i in range (3):
    if max < arr[i]:
        max = arr[i]
print(max * 3 - (arr[0] + arr[1] + arr[2]))