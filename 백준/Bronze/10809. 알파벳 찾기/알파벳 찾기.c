#include <stdio.h>
#include <string.h>

int main() {
    int i, alphabet[26];
    char word[100];
    
    for(i = 0; i < 26; i++){
        alphabet[i] = -1;
    }
    
    scanf("%s", word);
    
    for(i = 0; i < strlen(word); i++){
        if(alphabet[word[i]-'a'] == -1){
            alphabet[word[i]-'a'] = i;
        }  
    }
    
    for(i = 0; i < 26; i++){
        printf("%d ", alphabet[i]);
    }
    
    return 0;
}