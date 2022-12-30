#include <stdio.h>

int main()
{
    char s;
    int i, count = 0;

    for (i = 0; i < 6; i++) {
        scanf("%c\n", &s);
        if (s == 'W')
            count++;
    }

    if (count == 0)
        printf("-1");
    else if (count >= 5)
        printf("1");
    else if (count >= 3)
        printf("2");
    else
        printf("3");

    return 0;
}