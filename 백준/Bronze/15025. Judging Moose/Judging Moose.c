#include <stdio.h>

int main()
{
    int l, r;

    scanf("%d %d", &l, &r);

    if (l == r && l != 0 && r != 0)
        printf("Even %d", l * 2);
    else if (!l && !r)
        printf("Not a moose");
    else
        printf("Odd %d", l > r ? l * 2 : r * 2);

    return 0;
}