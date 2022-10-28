#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    if ((a + b) > (a - b))
        printf("%d\n%d", (a + b), (a - b));
    else
        printf("%d\n%d", (a - b), (a + b));

    return 0; 
}