#include <stdio.h>
#include <string.h>

int main()
{
    char s[101];
    int arr[26] = { 0 }, i, j;

    scanf("%s", &s);

    for (i = 0; i < strlen(s); i++)
		arr[s[i] - 'a']++;

	for (j = 0; j < 26; j++)
		printf("%d ", arr[j]);

    return 0;
}