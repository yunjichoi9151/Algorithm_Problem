#include <stdio.h>

int main()
{
    int x, y, z;

    scanf("%d\n%d\n%d", &x, &y, &z);

    printf("%d", ((x + y) <= (z + 0.5)) ? 1 : 0);

    return 0;
}