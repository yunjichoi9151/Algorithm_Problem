#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    while(a != 0 && b != 0) {
        printf("%s\n", (a > b) ? "Yes" : "No");
        scanf("%d %d", &a, &b);
    }

    return 0;
}