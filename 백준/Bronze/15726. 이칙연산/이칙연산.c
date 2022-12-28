#include <stdio.h>

int main()
{
    long long a, b, c, x, y;

    scanf("%lld %lld %lld", &a, &b, &c);

    x = (double)(a * b) / c;
    y = ((double)a / b) * c;

    printf("%lld", (x > y) ? x : y);

    return 0;
}