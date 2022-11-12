#include <stdio.h>

int main()
{
    int n, a, s, m, t, i;

    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        scanf("%d %d %d %d", &a, &s, &m, &t);
        printf("%d %d %s\n", a, s + m + t, (s + m + t >= 55 && s >= 35 * 0.3 && m >= 25 * 0.3 && t >= 40 * 0.3) ? "PASS" : "FAIL");
    }

    return 0;
}