#include <stdio.h>

int main()
{
    int n, k;

    scanf("%d\n%d", &n, &k);

    if (n < 60 + k)
        printf("%d", n * 1500);
    else
        printf("%d", (n - (60 + k)) * 3000 + (60 + k) * 1500);
    
    return 0;
}