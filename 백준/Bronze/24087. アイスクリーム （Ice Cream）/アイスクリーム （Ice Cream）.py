s = int(input())
a = int(input())
b = int(input())
if a >= s:
    print("250")
else:
    if (s - a) % b == 0:
        print(250 + 100 * ((s - a) // b))
    else:
        print(250 + 100 * ((s - a) // b + 1))