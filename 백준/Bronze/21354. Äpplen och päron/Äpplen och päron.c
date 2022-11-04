#include <stdio.h>

int main()
{
    int a, p;

    scanf("%d %d", &a, &p);

    if (a * 7 == p * 13)
        printf("lika");
    else
        printf("%s", (a * 7 > p * 13) ? "Axel" : "Petra");

    return 0;
}