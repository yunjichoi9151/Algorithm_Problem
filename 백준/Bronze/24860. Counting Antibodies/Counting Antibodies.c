#include <stdio.h>

int main()
{
    long long vk, jk, va, ja, vh, dh, jh;

    scanf("%ld %ld\n%ld %ld\n%ld %ld %ld", &vk, &jk, &va, &ja, &vh, &dh, &jh);

    printf("%ld", (vh * dh * jh) * (vk * jk + va * ja));
}