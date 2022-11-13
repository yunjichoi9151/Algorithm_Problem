#include <stdio.h>

int main()
{
    int x, y, r;

    scanf("%d %d\n%d", &x, &y, &r);

    printf("%d %d\n%d %d\n%d %d\n%d %d", x - r, y + r, x + r, y + r, x + r, y - r, x - r, y - r);

    return 0;
}