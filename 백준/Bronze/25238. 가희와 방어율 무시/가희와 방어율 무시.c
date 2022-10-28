#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    printf("%d", (a * (100 - b) / 100) < 100 ? 1 : 0);

    return 0;
}