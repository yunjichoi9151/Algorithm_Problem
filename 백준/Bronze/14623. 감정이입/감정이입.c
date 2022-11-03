#include <stdio.h>
#include <string.h>

int convert(char *n,int size) {
    int tmp = 0;
    for (int i = 0; i < size; i++)
        tmp = tmp * 2 + (n[i] - 48);
    return tmp;
}

int main()
{
    char a[31], b[31], r[100];
    int size = 0;
    scanf("%s %s",a, b);
    long long c = (long long) convert(a, strlen(a)) * convert(b, strlen(b));

    for(int i = 0; c != 0; i++) {
        r[i] = (c % 2) + 48;
        c /= 2;
        size++;
    }

    while(size--)
        printf("%c", r[size]);
    
    return 0;
}