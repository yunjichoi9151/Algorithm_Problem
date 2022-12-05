#include <stdio.h>

int main()
{
    int n, a, b, c, d, k, m;
    scanf("%d %d %d %d %d", &n, &a, &b, &c, &d);

    k = n / a + (n % a != 0 ? 1 : 0);
	m = n / c + (n % c != 0 ? 1 : 0);

    printf("%d", k * b > m * d ? m * d : k * b);

    return 0;
}