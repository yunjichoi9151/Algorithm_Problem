#include <stdio.h>

int main()
{
    int a, b, c, n;
    scanf("%d %d %d", &a, &b, &c);

    if (c <= b) {
        printf("-1");
        return 0;
    }
    
    n = a / (c - b) + 1;
    printf("%d", n);
    
    return 0;
}