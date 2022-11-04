#include <stdio.h>

int main()
{
    int n, i;

    scanf("%d", &n);
    
    printf("%s", (n / 1000000 == 5 && n / 100000 == 55 && n / 10000 == 555) ? "YES" : "NO");

    return 0;
}