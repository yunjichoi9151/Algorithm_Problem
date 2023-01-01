#include <stdio.h>

int main()
{
    int s, m, l;

    scanf("%d\n%d\n%d", &s, &m, &l);

    printf("%s", (s + m * 2 + l * 3 >= 10) ? "happy" : "sad");

    return 0;
}