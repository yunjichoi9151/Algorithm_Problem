#include <stdio.h>

int main()
{
    int n, i; 
    double sum = 0, m = 0;
    double numArr[1000];    
    scanf("%d", &n);

	for (i = 0; i < n; i++) {
		scanf("%lf",&numArr[i]);
		if (m < numArr[i]) {
			m = numArr[i];
		}
	}

    for (i = 0; i < n; i++) {
		sum += numArr[i] / m * 100;
	}
    
    printf("%lf", sum / n);
}