#include <stdio.h>

int main()
{
    int n, w, h, l;

    scanf("%d %d %d %d", &n, &w, &h, &l);

    printf("%d", (n >= (w / l) * (h / l)) ? (w / l) * (h / l) : n);

    return 0;
}