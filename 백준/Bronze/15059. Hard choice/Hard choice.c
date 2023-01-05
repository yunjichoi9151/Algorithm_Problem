#include <stdio.h>

int main()
{
    int arr1[4], arr2[4], i, sum = 0;

    scanf("%d %d %d", &arr1[0], &arr1[1], &arr1[2]);
    scanf("%d %d %d", &arr2[0], &arr2[1], &arr2[2]);

    for (i = 0; i < 3; i++) {
        if (arr1[i] < arr2[i])
            sum += arr2[i] - arr1[i];
    }
    
    printf("%d", sum);

    return 0;
}