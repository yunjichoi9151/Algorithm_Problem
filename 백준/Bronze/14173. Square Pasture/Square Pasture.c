#include <stdio.h>

int max(int a, int b) {
    if (a >= b)
        return a;
    else
        return b;
}

int min(int a, int b) {
    if (a < b)
        return a;
    else
        return b;
}

int main()
{
    int x1, y1, x2, y2, x3, y3, x4, y4;

    scanf("%d %d %d %d\n%d %d %d %d", &x1, &y1, &x2, &y2, &x3, &y3, &x4, &y4);

    int A = max(x2, x4) - min(x1, x3);
    int B = max(y2, y4) - min(y1, y3);
    
    printf("%d", max(A, B) * max(A, B));

    return 0;
}