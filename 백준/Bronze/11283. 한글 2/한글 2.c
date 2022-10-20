#include <stdio.h>

int main()
{
    char s[4];

    scanf("%s", s);

    printf("%d", s[0] * 4096 + s[1] * 64 + s[2] + 95361);
    
    return 0;
}