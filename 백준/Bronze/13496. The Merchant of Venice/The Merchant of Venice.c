#include <stdio.h>

int main()
{
    int k, n, s, d, d_i, v_i, i, j, sum = 0;

    scanf("%d", &k);

    for (i = 0; i < k; i++) {
        scanf("%d %d %d", &n, &s, &d);
        for (j = 0; j < n; j++) {
            scanf("%d %d", &d_i, &v_i);
            if (s * d >= d_i)
                sum += v_i;
        }
        printf("Data Set %d:\n%d\n\n", i + 1, sum);
        sum = 0;
    }

    return 0;
}