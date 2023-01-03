#include <stdio.h>
#include <string.h>

int main()
{
    int n, i, j, score, sum;
    char string[80];    
    scanf("%d", &n);

	for (i = 0; i < n; i++) {
        sum = 0;
        score = 1;
		scanf("%s", string);
		for(j = 0; j < strlen(string); j++) {
            if(string[j] == 'O') {
                sum += score;
                score++;
            }
            if(string[j] == 'X') {
                score = 1;
            }
        }
        printf("%d\n", sum);
	}
    return 0;
}