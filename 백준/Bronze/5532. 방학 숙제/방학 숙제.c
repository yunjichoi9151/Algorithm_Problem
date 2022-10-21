#include <stdio.h>

int main()
{
    int l, a, b, c, d;

    scanf("%d\n%d\n%d\n%d\n%d", &l, &a, &b, &c, &d);

    if ((a / c) > (b / d))
        if (a % c == 0)
            printf("%d", l - (a / c));
        else
            printf("%d", l - (a / c + 1));
    else
        if (b % d == 0)
            printf("%d", l - (b / d));
        else
            printf("%d", l - (b / d + 1));

    return 0;
}