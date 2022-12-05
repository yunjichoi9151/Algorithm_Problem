#include <stdio.h>

int main()
{
    int k, w, m;

    scanf("%d %d %d", &k, &w, &m);

    if ((w - k) % m == 0)
        printf("%d", (w - k) / m);
    else
        printf("%d", (w - k) / m + 1);

    return 0;
}