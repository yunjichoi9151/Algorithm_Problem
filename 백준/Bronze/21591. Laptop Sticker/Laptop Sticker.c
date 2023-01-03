#include <stdio.h>

int main()
{
    int w_c, h_c, w_s, h_s;

    scanf("%d %d %d %d", &w_c, &h_c, &w_s, &h_s);

    printf("%d", ((w_c - 2 >= w_s) && (h_c - 2 >= h_s)) ? 1 : 0);

    return 0;
}