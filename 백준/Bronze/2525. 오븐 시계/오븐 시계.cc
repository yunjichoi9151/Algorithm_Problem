#include <stdio.h>

int main()
{
    int a, b, c, d;

    scanf("%d %d\n%d", &a, &b, &c);

    d = a * 60 + b + c;
    int h = d / 60;
    int m = d % 60;

    if (h > 23) {
        h -= 24;
    }
    
    printf("%d %d", h, m);

    return 0;
}