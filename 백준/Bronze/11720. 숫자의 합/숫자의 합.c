#include <stdio.h>

int main()
{
    int n, i, sum = 0;
    char numArr[100];   

    scanf("%d", &n);
    scanf("%s", numArr);

	for (i = 0; i < n; i++) {
		sum += numArr[i] - '0';
        
	}
    printf("%d\n", sum);
    return 0;
}