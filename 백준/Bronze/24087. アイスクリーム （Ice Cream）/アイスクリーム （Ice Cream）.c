#include <stdio.h>

int main()
{
    int s, a, b;

    scanf("%d\n%d\n%d", &s, &a, &b);

    if (a >= s)
        printf("250");
    else {
        if ((s - a) % b == 0)
            printf("%d", 250 + 100 * ((s - a) / b));
        else
            printf("%d", 250 + 100 * ((s - a) / b + 1));
    }
    
    return 0;
}