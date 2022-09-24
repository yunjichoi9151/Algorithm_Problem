#include <stdio.h>

int main()
{
    int n, m, k;

    scanf("%d %d %d", &n, &m, &k);

    printf("%d", (m >= k) ? k + n - m : m + n - k);

    return 0;
}