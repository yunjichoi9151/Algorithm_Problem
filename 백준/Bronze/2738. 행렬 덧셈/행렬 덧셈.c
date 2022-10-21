#include <stdio.h>

int main()
{
    int n, m, numArr1[101][101], numArr2[101][101];

    scanf("%d %d", &n, &m);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            scanf("%d", &numArr1[i][j]);
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            scanf("%d", &numArr2[i][j]);
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            printf("%d ", numArr1[i][j] + numArr2[i][j]);
        }
        printf("\n");
    }
    return 0;
}