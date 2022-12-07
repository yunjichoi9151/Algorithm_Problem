#include <stdio.h>

int main()
{
	int numArr[9], index, max = 0;
	for (int i = 0; i < 9; i++) {
		scanf("%d",&numArr[i]);
		if (max < numArr[i]) {
			max = numArr[i];
			index = i;
		}
	}
	printf("%d\n%d", max, index + 1);
}