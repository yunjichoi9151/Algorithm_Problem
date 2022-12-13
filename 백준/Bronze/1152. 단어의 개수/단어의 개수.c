#include <stdio.h>
#include <string.h>

int main()
{
    int i, len, count = 0;
    char words[1000000];
    scanf("%[^\n]", words);
    len = strlen(words);
    if(len == 1){
        if(words[0] == ' ') {
            printf("0\n");
            return 0;
        }
    }
    for(i = 1; i < len - 1; i++) {
        if(words[i] == ' ')
            count++;
    }
    printf("%d\n", count + 1);
    return 0;
}
