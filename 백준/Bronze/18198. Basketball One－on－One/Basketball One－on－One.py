sum_a = 0
sum_b = 0
Arr = list(input())
for i in range(0,len(Arr),2):
    if Arr[i]=="A":
        sum_a += int(Arr[i+1])
    elif Arr[i]=="B":
        sum_b += int(Arr[i+1])
print('A' if sum_a > sum_b else 'B')