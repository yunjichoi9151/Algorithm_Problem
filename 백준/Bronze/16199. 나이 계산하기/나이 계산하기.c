#include <stdio.h>

int main()
{
    int y1, m1, d1, y2, m2, d2, a, b, c;

    scanf("%d %d %d\n%d %d %d", &y1, &m1, &d1, &y2, &m2, &d2);

    c = y2 - y1;
    b = c + 1;
    if ((m1 == m2 && d1 <= d2) || (m1 < m2))
        a = y2 - y1;
    else
        a = y2 - y1 - 1;
    
    printf("%d\n%d\n%d", a, b, c);

    return 0;
}