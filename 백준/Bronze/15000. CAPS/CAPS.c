#include <stdio.h>

int main()
{
    char c;
    for (int i = 0; ; i++){
        scanf("%c", &c);
        if (c == '\n')
            break;
        printf("%c", c + 'A' - 'a');
    }
    return 0;
}