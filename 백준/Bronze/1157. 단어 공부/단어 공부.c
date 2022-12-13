# include <stdio.h>
# include <string.h>

int main()
{
    int i, j, m = 0, alphabet[26] = {0, };
    char string[1000000], a = '?';

    scanf("%s", string);
    
    for(i = 0; string[i] != '\0'; i++) {
        if(string[i] >= 'a')
            string[i] -= 32;
        alphabet[string[i] - 65]++;
    }
    
    for(i = 0; i < 26; i++) {
        if(m < alphabet[i]) {
            m = alphabet[i];
            a = i;
        }
        else if(m == alphabet[i])
            a = '?';
    }

    if(a != '?')
        printf("%c", 65 + a);
    else
        printf("?");

    return 0;
}
