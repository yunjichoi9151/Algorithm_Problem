#include <stdio.h>

int main()
{
    int a1, b1, c1, a2, b2, c2, a, b;

    scanf("%d\n%d\n%d\n%d\n%d\n%d", &a1, &b1, &c1, &a2, &b2, &c2);

    a = a1 * 3 + b1 * 2 + c1;
    b = a2 * 3 + b2 * 2 + c2;

    if (a == b)
        printf("T");
    else
        printf("%s", (a > b) ? "A" : "B");

    return 0;
}