#include <stdio.h>

int main()
{
    int n, i, numArr[21];

    scanf("%d", &n);

    numArr[0] = 0;
    numArr[1] = 1;

    for (i = 0; i < n - 1; i++) {
        numArr[i + 2] = numArr[i] + numArr[i + 1];
    }

    printf("%d", numArr[n]);

    return 0;
}