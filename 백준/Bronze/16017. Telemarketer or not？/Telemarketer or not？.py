numArr = [int(input()) for i in range(4)]
if (numArr[0] == 8 or numArr[0] == 9) and (numArr[3] == 8 or numArr[3] == 9) and numArr[1] ==  numArr[2]:
    print("ignore")
else:
    print("answer")