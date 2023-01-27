n = int(input())
s = input()
sum = 0
for i in s:
    if i in 'aeiou':
        sum += 1
print(sum)