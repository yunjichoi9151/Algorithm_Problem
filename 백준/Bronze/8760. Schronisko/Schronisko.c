#include <stdio.h>

int main()
{
    int z, w, k;

    scanf("%d", &z);

    for (int i = 0; i < z; i++) {
        scanf("%d %d", &w, &k);
        printf("%d\n", (w * k) / 2);
    }

    return 0;
}