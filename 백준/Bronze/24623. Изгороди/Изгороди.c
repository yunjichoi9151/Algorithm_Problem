#include <stdio.h>

int main()
{
    double n, a;

    scanf("%lf\n%lf", &n, &a);

    printf("%d", (int)((180 - a) / 2 + a / 2));

    return 0;
}