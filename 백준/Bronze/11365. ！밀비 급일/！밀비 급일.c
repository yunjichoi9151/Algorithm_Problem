#include <stdio.h>
#include <string.h>

int main()
{
    char s[501] = { 0, };
    
    while (1) {
        gets(s);
        if (strcmp(s, "END") == 0)
            break;
        for (int i = strlen(s) - 1; i >= 0; i--)
            printf("%c", s[i]);
        printf("\n");
    }
    return 0;
}