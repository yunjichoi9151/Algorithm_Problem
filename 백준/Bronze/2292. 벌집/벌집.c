#include  <stdio.h>

int main()
{
    int n, r, x = 0, y = 0;
    scanf("%d", &n);
    while (1) {
        if (n <= 6 * x + 1) {
            r = y + 1;
            break;
        }
        y++;
        x += y;
    }
    printf("%d", r);
}