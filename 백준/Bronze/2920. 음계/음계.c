#include <stdio.h>

int main()
{
	int a = 1, b = 1;
    int input[10];

    for (int i = 0; i < 8; i++) {
        scanf("%d", &input[i]);
    }

    for (int i = 0; i < 8; i++) {
        if (input[i] != i + 1) {
            a = 0;
            break;
        }
    }

    for (int i = 0; i < 8; i++) {
        if (input[i] != 8 - i) {
            b = 0;
            break;
        }
    }

    if (a == 0 && b == 0)
        printf("mixed\n");
    else if(a == 1)
        printf("ascending\n");
    else if(b == 1)
        printf("descending\n");

    return 0;
}