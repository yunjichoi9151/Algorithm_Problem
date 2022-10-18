#include <stdio.h>

int main()
{
    int p, q;

    scanf("%d\n%d", &p, &q);

    if (q > 30)
        printf("Red");
    else if (p <= 50 && q <= 10)
        printf("White");
    else
        printf("Yellow");

    return 0;
}