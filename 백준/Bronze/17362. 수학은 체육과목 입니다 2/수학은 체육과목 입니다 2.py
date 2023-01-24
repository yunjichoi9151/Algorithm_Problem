n = int(input())
if n % 2 == 0:
    if n % 8 == 0 or n % 8 == 2:
        print("2")
    elif n % 8 == 4 or n % 8 == 6:
            print("4")
else:
    if n % 4 == 3:
        print("3")
    elif n % 8 == 1:
        print("1")
    elif n % 8 == 5:
        print("5")