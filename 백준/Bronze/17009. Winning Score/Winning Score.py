numArr = [int(input()) for i in range(6)]
a = numArr[0] * 3 + numArr[1] * 2 + numArr[2]
b = numArr[3] * 3 + numArr[4] * 2 + numArr[5]
if a == b:
    print('T')
else:
    print('A' if a > b else 'B')