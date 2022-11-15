#include <stdio.h>

int main()
{
    int n, a, b, c;

    scanf("%d", &n);
    printf("Gnomes:\n");

    for (int i = 0; i < n; i++) {
        scanf("%d %d %d", &a, &b, &c);
        if ((a <= b && b <= c) || (c <= b && b <= a))
            printf("Ordered\n");
        else
            printf("Unordered\n");
    }

    return 0;
}