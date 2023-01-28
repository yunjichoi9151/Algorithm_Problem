dial = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
word = input()
time = 0

for j in range(len(word)):
    for i in dial:
        if word[j] in i:
            time += dial.index(i) + 3
            
print(time)