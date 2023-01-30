fish = [int(input()) for i in range(4)]
inc = 0
dec = 0
same = 0

for i in range(3):
	if fish[i] < fish[i + 1]:
		inc += 1
	elif fish[i] > fish[i + 1]:
		dec += 1
	elif fish[i] == fish[i + 1]:
		same += 1

if inc == 3:
	print('Fish Rising')
elif dec == 3:
	print('Fish Diving')
elif same == 3:
	print('Fish At Constant Depth')
elif inc != 3 or dec != 3 or same != 3:
	print('No Fish')