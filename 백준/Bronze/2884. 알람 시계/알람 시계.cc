#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    if (b < 45) {
        b += 15;
        if (a == 0)
            a = 23;
        else
            a -= 1;
    }
    else
        b -= 45;
    
    printf("%d %d", a, b);

    return 0;
}