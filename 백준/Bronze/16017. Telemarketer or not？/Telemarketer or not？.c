#include <stdio.h>

int main()
{
    int numArr[5], i;

    for (i = 0; i < 4; i++)
        scanf("%d", &numArr[i]);
    
    if ((numArr[0] == 8 || numArr[0] == 9) && (numArr[3] == 8 || numArr[3] == 9) && numArr[1] ==  numArr[2])
        printf("ignore");
    else
        printf("answer");

    return 0;
}