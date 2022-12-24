#include <stdio.h>

int main()
{
    char s[51];
    int sum = 0, n;

    scanf("%d\n%s", &n, &s);

    for (int i = 0; i < n; i++) {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
            sum += 1;
    }

    printf("%d", sum);

    return 0;
}