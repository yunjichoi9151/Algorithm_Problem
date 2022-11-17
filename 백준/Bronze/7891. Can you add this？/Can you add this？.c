#include <stdio.h>

int main()
{
    long long t, x, y;

    scanf("%lld", &t);

    for (int i = 0; i < t; i++) {
        scanf("%lld %lld", &x, &y);
        printf("%lld\n", x + y);
    }

    return 0;
}