#include <stdio.h>

int main()
{
    int a, b, c, arr[3];

    scanf("%d %d %d", &a, &b, &c);

    arr[0] = a * 4 + b * 2;
    arr[1] = b * 2 + c * 4;
    arr[2] = a * 2 + c * 2;

    int min = arr[0];
	if(arr[1] < min)
		min = arr[1];
	if(arr[2] < min)
		min = arr[2];

    printf("%d", min);
}