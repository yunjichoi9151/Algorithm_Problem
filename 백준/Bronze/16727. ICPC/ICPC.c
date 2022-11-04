#include <stdio.h>

int main()
{
    int p1, s1, s2, p2;

    scanf("%d %d\n%d %d", &p1, &s1, &s2, &p2);

    if (p1 + p2 == s1 + s2) {
        if (s1 == p2)
            printf("Penalty");
        else
            printf("%s", (s1 < p2) ? "Persepolis" : "Esteghlal");
    }
    else
        printf("%s", (p1 + p2 > s1 + s2) ? "Persepolis" : "Esteghlal");
}