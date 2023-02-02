n = int(input())
for i in range(n):
    string = str(input().rstrip())
    sum = 0
    add = 1
    for s in string:
        if s == 'O':
            sum += add
            add += 1
        else:
            add = 1;
    print(sum)