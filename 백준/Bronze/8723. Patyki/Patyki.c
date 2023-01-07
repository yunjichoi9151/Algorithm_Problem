#include <stdio.h>

int main()
{
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    if (a == b && b == c && a == c)
        printf("2");
    else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
        printf("1");
    else
        printf("0");
    
    return 0;
}