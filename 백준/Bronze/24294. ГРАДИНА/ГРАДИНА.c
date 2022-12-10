#include <stdio.h>

int main()
{
    int w1, h1, w2, h2;

    scanf("%d %d %d %d", &w1, &h1, &w2, &h2);

    printf("%d", (w1 > w2) ? 4 + 2 * w1 + 2 * (h1 + h2) : 4 + 2 * w2 + 2 * (h1 + h2));

    return 0;
}