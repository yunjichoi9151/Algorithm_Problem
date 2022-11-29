#include <stdio.h>

int main()
{
    int piece[6];
    int a[6] = {1, 1, 2, 2, 2, 8};

    for (int i = 0; i < 6; i++) {
        scanf("%d", &piece[i]);
        printf("%d ", a[i] - piece[i]);
    }

    return 0;
}