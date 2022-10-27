#include <stdio.h>

int main()
{
    int a, b, c, d, e, sum = 0;

    scanf("%d\n%d\n%d\n%d\n%d", &a, &b, &c, &d, &e);

    if (a < 0)
        sum += (0 - a) * c + d + b * e;
    else
        sum += (b - a) * e;

    printf("%d", sum);

    return 0;
}