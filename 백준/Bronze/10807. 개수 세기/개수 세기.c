#include <stdio.h>

int main()
{
    int n, v, i, j, sum = 0, numArr[101];

    scanf("%d", &n);

    for(i = 0; i < n; i++) {
        scanf("%d", numArr + i);
    }

    scanf("%d", &v);
    
    for(j = 0; j < n; j++) {
        if (numArr[j] == v)
            sum++;
    }
    
    printf("%d", sum);

    return 0;
}