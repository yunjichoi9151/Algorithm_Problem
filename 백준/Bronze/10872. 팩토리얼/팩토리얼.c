#include <stdio.h>

int main()
{
    int n, i, fac = 1;

    scanf("%d", &n);

    for (i = 1; i < n + 1; i++) {
        fac *= i;
    }

    printf("%d", fac);

    return 0;
}