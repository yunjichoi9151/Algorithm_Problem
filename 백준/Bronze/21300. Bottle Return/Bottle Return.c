#include <stdio.h>

int main()
{
    int a, i, sum = 0;

    for (i = 0; i < 6; i++) {
        scanf("%d", &a);
        sum += a;
    }
    printf("%d", sum * 5);

    return 0;
}