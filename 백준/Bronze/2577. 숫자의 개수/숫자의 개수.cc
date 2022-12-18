#include <stdio.h>

int main()
{
	int numArr[10] = { 0, };
    int a, b, c, d, num;

    scanf("%d\n%d\n%d", &a, &b, &c);

    d = a * b * c;

    while(d > 0){
        numArr[d % 10]++;
        d /= 10;
    }
    
    for(int i = 0; i < 10;i++){
        printf("%d\n", numArr[i]);
    }
    return 0;
}