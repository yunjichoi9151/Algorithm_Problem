#include <stdio.h>

int main()
{
    int x, k;

    scanf("%d %d", &x, &k);

	if (7000 * k <= x * 1000)
		printf("%d", 7000 * k);
	else if (3500 * k <= x * 1000)
		printf("%d", 3500 * k);
	else if (1750 * k <= x * 1000)
		printf("%d", 1750 * k);
    else
        printf("0");

}