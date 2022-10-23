#include <stdio.h>
#include <math.h>

int main()
{
    double a;

    scanf("%lf", &a);
    
    printf("%.7lf", sqrt(a) * 4);
}