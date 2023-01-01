#include <stdio.h>

int main()
{
    int a;

    scanf("%d", &a);

    for (int i = 1; i <= 9; i++) {
        int m = i * a;
        printf("%d * %d = %d\n", a, i, m);
    }

    return 0;
}