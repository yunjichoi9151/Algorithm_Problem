#include <stdio.h>

int main()
{
    int a, b, c;

    scanf("%d\n%d\n%d", &a, &b, &c);

    printf("The 1-3-sum is %d", 9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3 + a * 1 + b * 3 + c * 1);

    return 0;
}