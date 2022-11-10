#include <stdio.h>

int main()
{
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    if (a == b || b == c || c == a || a + b == c || b + c == a || c + a == b)
        printf("S");
    else
        printf("N");

    return 0;
}