#include <stdio.h>

int main()
{
    int a, x, b, y, t;

    scanf("%d\n%d\n%d\n%d\n%d", &a, &x, &b, &y, &t);

    if (t <= 30)
        printf("%d %d", a, b);
    else if (t > 30 && t <= 45)
        printf("%d %d", a + 21 * x * (t - 30), b);
    else if (t > 45)
        printf("%d %d", a + 21 * x * (t - 30), b + 21 * y * (t - 45));

    return 0;
}