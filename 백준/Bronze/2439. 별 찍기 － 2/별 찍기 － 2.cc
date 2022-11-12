#include <stdio.h>

int main()
{
    int a;

    scanf("%d", &a);

    for (int i = 0; i < a; i++) {
        for (int j = a - 1; j > i; j--) {
            printf(" ");
        }
        for (int j = 0; j < i + 1; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}