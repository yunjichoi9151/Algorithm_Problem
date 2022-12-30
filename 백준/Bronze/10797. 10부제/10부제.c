#include <stdio.h>

int main()
{
    int x, i, car[5], sum = 0;

    scanf("%d", &x);
    for (i = 0; i < 5; i++) {
        scanf("%d", &car[i]);
        if (car[i] == x)
            sum += 1;
    }

    printf("%d", sum);

    return 0;
}