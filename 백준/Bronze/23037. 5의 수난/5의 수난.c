#include <stdio.h>
#include <math.h>

int main()
{
    int n, i, sum = 0, numArr[5] = { 0 };
	for (i = 0; i < 5; i++) {
		scanf("%1d", &numArr[i]);
		sum += pow(numArr[i], 5);
	}
	printf("%d", sum);

    return 0;
}