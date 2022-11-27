score = [] 
for i in range(6):  
    score.append(int(input())) 
score1 = sorted(score[:4]) 
score2 = sorted(score[4:]) 
print(sum(score1[1:]) + score2[-1])