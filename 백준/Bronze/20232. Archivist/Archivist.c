#include <stdio.h>

int main()
{
    int y; 

    scanf("%d", &y);

    if (y == 1996 || y == 1997 || y == 2000 || y == 2007 || y == 2008 || y == 2013 || y == 2018)
        printf("SPbSU");
    else if (y == 2006)
        printf("PetrSU, ITMO");
    else
        printf("ITMO");

    return 0;
}