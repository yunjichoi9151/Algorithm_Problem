#include <stdio.h>

int main()
{
	double x, y, z, xi, yi, zi;
	scanf("%lf %lf %lf\n%lf %lf %lf", &x, &y, &z, &xi, &yi, &zi);

	if (xi >= x && yi >= y && zi >= z)
		printf("A");
	else if (xi >= x / 2 && yi >= y && zi >= z)
		printf("B");
	else if (yi >= y && zi >= z)
		printf("C");
	else if (yi >= y / 2 && zi >= z)
		printf("D");
	else
		printf("E");

}