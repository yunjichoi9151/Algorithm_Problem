#include <stdio.h>

int main()
{
    int num, new_num, tmp, a, b, count = 0;

    scanf("%d", &num);

    tmp = num;

    while(1) {
        a = tmp / 10;
        b = tmp % 10;
        new_num = b * 10 + (a + b) % 10;
        count++;
        if(num == new_num)
            break;
        else
            tmp = new_num;
    }
    printf("%d", count);
    return 0;
}