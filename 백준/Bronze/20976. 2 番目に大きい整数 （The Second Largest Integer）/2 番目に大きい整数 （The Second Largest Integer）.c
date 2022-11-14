#include <stdio.h>

int main()
{
    int arr[4], i, j, temp = 0;

    scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);

    int max = arr[0];

    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("%d", arr[1]);

    return 0;

}