#include <stdio.h>

int main()
{
    double m, s, g, a, b, l, r;

    scanf("%lf %lf %lf\n%lf %lf\n%lf %lf", &m, &s, &g, &a, &b, &l, &r);

    printf("%s", (m / g + l / a > m / s + r / b) ? "latmask" : "friskus");

    return 0;
}