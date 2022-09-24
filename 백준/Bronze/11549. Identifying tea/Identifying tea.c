#include <stdio.h>

int main()
{
    int t, i, tea[5], sum = 0;

    scanf("%d", &t);
    for (i = 0; i < 5; i++) {
        scanf("%d", &tea[i]);
        if (tea[i] == t)
            sum += 1;
    }

    printf("%d", sum);

    return 0;
}