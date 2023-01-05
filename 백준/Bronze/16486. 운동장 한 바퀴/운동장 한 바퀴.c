#include <stdio.h>

int main()
{
    float d1, d2;

    scanf("%f\n%f", &d1, &d2);

    printf("%.6f", d1 * 2 + d2 * 2 * 3.141592);

    return 0;
    
}