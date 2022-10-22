#include <stdio.h>

int main()
{
    int n, sum = 1;

    scanf("%d", &n);

    for (int i = 0; i < n; i++)
        sum *= 2;
    
    printf("%d", sum);

    return 0;
}