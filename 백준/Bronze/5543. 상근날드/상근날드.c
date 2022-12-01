#include <stdio.h>

int main()
{
    int burger[3], drink[2], i, min_b, min_d;

    scanf("%d\n%d\n%d\n%d\n%d", &burger[0], &burger[1], &burger[2], &drink[0], &drink[1]);

    min_b = burger[0];
    min_d = drink[0];

    for (i = 0; i < 3; i++) {
        if (min_b > burger[i])
            min_b = burger[i];
    }
    for (i = 0; i < 2; i++) {
        if (min_d > drink[i])
            min_d = drink[i];
    }
    
    printf("%d", min_b + min_d - 50);

    return 0;
}