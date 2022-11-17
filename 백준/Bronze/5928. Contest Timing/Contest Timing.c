#include <stdio.h>

int main()
{
    int d, h, m;

    scanf("%d %d %d", &d, &h, &m);

    if (d == 11 && h == 11 && m < 11 || d == 11 && h < 11 || d < 11)
        printf("-1");
    else {
        if (d == 11)
            printf("%d", (h * 60 + m) - (11 * 60 + 11));
        else {
            printf("%d", ((d - 12) * 24 * 60) + (12 * 60 + 49) + (h * 60 + m));
        }
    }
}