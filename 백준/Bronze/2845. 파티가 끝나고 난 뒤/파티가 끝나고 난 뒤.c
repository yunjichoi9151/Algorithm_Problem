#include <stdio.h>

int main()
{
    int l, p, i, a;

    scanf("%d %d", &l, &p);

    for (i = 0; i < 5; i++) {
        scanf("%d", &a);
        printf("%d ", a - l * p);
    }

    return 0;
}