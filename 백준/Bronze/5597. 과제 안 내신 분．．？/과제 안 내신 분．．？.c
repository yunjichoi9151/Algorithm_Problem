#include <stdio.h>

int main()
{
    int numArr[30] = {0, }, i, tmp;

    for (i = 0; i < 28; i ++) {
        scanf("%d", &tmp);
        numArr[tmp - 1] = tmp;
    }
    for (i = 0; i < 30; i ++) {
        if (numArr[i] == 0)
            printf("%d\n", i + 1);
    }
    return 0;
}