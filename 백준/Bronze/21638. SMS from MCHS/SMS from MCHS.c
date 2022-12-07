#include <stdio.h>

int main()
{
    int t1, v1, t2, v2;

    scanf("%d %d\n%d %d", &t1, &v1, &t2, &v2);

    if (t2 < 0 && v2 >= 10)
        printf("A storm warning for tomorrow! Be careful and stay home if possible!");
    else if (t1 > t2)
        printf("MCHS warns! Low temperature is expected tomorrow.");
    else if (t1 <= t2 && v1 < v2)
        printf("MCHS warns! Strong wind is expected tomorrow.");
    else
        printf("No message");

    return 0;
}