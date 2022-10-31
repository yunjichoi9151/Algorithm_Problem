#include <stdio.h>
#include <math.h>

int main()
{
    int d, h, w;
    double x, num1, num2;

    scanf("%d %d %d", &d, &h, &w);

    x = sqrt(h * h + w * w);
    num1 = h * d / x;
    num2 = w * d / x;

    printf("%d %d", (int)num1, (int)num2);

    return 0;
}