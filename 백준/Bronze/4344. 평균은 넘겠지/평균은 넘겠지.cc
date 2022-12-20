#include <stdio.h>

int main()
{
    int c, n, i, j, sum, score[1000];
    float avg;
    scanf("%d", &c);

	for (i = 0; i < c; i++) {
        sum = 0;
		scanf("%d", &n);
		for(j = 0; j < n; j++) {
            scanf("%d", &score[j]);
            sum += score[j];
        }
        avg = (float)sum / (float)n;
        sum = 0;
        for(j = 0; j < n; j++) {
            if(avg < score[j]) {
                sum++;
            }
        }
        avg = (float)sum / (float)n * 100;
        printf("%.3f%%\n", avg);
	}
    return 0;
}