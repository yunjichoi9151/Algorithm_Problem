#include <stdio.h>
#include <math.h>

int main()
{
    double r, c, n;

    scanf("%lf %lf %lf", &r, &c, &n);

    printf("%ld", (long) ceil(r / n) * (long) ceil(c / n));

    return 0;
}