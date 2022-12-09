#include <stdio.h>
#include <math.h>

int main()
{
    double w, h;

    scanf("%lf %lf", &w, &h);

    printf("%lf", (w + h) - (sqrt(w * w + h * h)));

    return 0;
}