#include <stdio.h>

int main()
{
    int a, i;

    scanf("%d %d", &a, &i);

    printf("%d\n", a * (i - 1) + 1);
}