#include <stdio.h>

int main()
{
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    if (a == b && b == c && c == a)
        printf("*");
    else {
        if (a == b)
            printf("C");
        if (b == c)
            printf("A");
        if (c == a)
            printf("B");
    }
    return 0;
}