#include <stdio.h>
#include <stdbool.h>

int main()
{
    long long p1, q1, p2, q2;

    scanf("%lld %lld %lld %lld", &p1, &q1, &p2, &q2);

    bool a = (p1 * p2 % (q1 * q2 * 2) == 0);

    printf("%d", a);

    return 0;
}