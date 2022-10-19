#include <stdio.h>
#include <math.h>

int main()
{
    double a, PI = 3.1415926535897932384;

    scanf("%lf", &a);

    printf("%.10lf", sqrt(a / PI) * 2 * PI);

    return 0;
}