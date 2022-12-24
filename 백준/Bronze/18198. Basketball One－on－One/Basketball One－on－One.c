#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char Arr[201];
    int sum_a = 0, sum_b = 0, tmp;

    scanf("%s", &Arr);

    for (int i = 0; i < strlen(Arr); i += 2) {
        if (Arr[i] == 'A') {
            tmp = atoi(&Arr[i + 1]);
            sum_a += tmp;
        }
        else if (Arr[i] == 'B') {
            tmp = atoi(&Arr[i + 1]);
            sum_b += tmp;
        }
    }

    printf("%c", (sum_a > sum_b) ? 'A' : 'B');

    return 0;
}