#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, l, r;

    scanf("%d %d %d", &x, &l, &r);

    if (l < x && x < r)
        printf("%d", x);
    else
        printf("%d", (abs(l - x) > abs(r - x)) ? r : l);

    return 0;
}