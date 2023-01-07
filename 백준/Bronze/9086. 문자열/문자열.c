#include <stdio.h>
#include <string.h>

int main()
{
    char s[1001];
    int n, i;

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%s", &s);
        printf("%c%c\n", s[0], s[strlen(s) - 1]);
    }
    return 0;
}