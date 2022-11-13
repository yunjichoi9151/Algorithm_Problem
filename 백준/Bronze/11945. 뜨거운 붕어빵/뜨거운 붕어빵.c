#include <stdio.h>

int main()
{
    int n, m, i, j;
    char matrix[11];

    scanf("%d %d", &n, &m);

    for(int i = 0; i < n; i++){
        scanf("%s", matrix);
        for(int j = m-1; j >= 0; j--){
            printf("%c", matrix[j]);
        }
        printf("\n");
    }

    return 0;
}