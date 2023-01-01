#include <stdio.h>

int main()
{
    int u_r, t_r, u_o, t_o;

    scanf("%d %d %d %d", &u_r, &t_r, &u_o, &t_o);

    printf("%d", 56 * u_r + 24 * t_r + 14 * u_o + 6 * t_o);

    return 0;
}