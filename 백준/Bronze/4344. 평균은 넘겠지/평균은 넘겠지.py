c = int(input())

for i in range(c):
    num = list(map(int, input().split()))
    avg = sum(num[1:])/num[0]
    count = 0
    for i in range(1, len(num)):
        if num[i] > avg:
            count += 1
            
    print('%.3f' % (count / num[0] * 100) + '%')