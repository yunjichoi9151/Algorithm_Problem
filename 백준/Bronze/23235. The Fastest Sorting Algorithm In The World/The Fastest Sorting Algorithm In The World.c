#include <stdio.h>

int main()
{
    int n, t, i = 1;

    while (1) {
		scanf("%d", &n);
		if (n == 0)
			break;
		for(int i = 0; i < n; i++)
            scanf("%d", &t);
        printf("Case %d: Sorting... done!\n",i);
        i++;
	}
}