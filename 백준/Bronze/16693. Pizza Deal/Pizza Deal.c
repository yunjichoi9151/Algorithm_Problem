#include <stdio.h>

int main()
{
    int a1, p1, r1, p2;

    scanf("%d %d\n%d %d", &a1, &p1, &r1, &p2);

    printf("%s", (a1 * p2 > r1 * r1 * 3.1415926535 * p1) ? "Slice of pizza" : "Whole pizza");

    return 0;
}