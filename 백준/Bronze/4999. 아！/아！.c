#include <stdio.h>

int main()
{
    char str1[1001], str2[1001];
    int i, count1 = 0, count2 = 0;

    scanf("%s\n%s", &str1, &str2);

    for (i = 0; str1[i]; i++) {
        if (str1[i] == 'a')
            count1 += 1;
        else
            break;
    }

    for (i = 0; str2[i]; i++) {
        if (str2[i] == 'a')
            count2 += 1;
        else
            break;
    }

    printf("%s", (count1 >= count2) ? "go" : "no");

    return 0;
}