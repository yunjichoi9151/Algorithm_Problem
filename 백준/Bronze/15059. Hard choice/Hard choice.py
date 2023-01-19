arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
sum = 0
for i in range (3):
    if arr1[i] < arr2[i]:
        sum += arr2[i] - arr1[i]
print(sum)