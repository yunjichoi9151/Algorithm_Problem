#include <stdio.h>

int main()
{
    int a[4], sum_one = 0, sum_two = 0;

    for (int i = 0; i < 3; i++) {
        scanf("%d", &a[i]);
        if (a[i] == 1)
            sum_one += 1;
        else if (a[i] == 2)
            sum_two += 1;
    }
    printf("%d", (sum_one > sum_two) ? 1 : 2);

    return 0;
}