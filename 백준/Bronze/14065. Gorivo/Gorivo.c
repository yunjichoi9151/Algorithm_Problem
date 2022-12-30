#include <stdio.h>

int main()
{
    double x;

	scanf("%lf", &x);

	printf("%.6lf", 100 * 3.785411784 / (1.609344 * x));

    return 0;
}