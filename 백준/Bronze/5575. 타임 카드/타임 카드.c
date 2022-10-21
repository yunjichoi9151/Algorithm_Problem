#include <stdio.h>

int main()
{
    int h1, m1, s1, h2, m2, s2, t, i, H[3], M[3], S[3];

    for (i = 0; i < 3; i++) {
        scanf("%d %d %d %d %d %d", &h1, &m1, &s1, &h2, &m2, &s2);
        t = h2 * 3600 + m2 * 60 + s2 - (h1 * 3600 + m1 * 60 + s1);
        H[i] = t / 3600 % 24;
		M[i] = t / 60 % 60;
		S[i] = t % 60;
    }
    printf("%d %d %d\n%d %d %d\n%d %d %d\n", H[0], M[0], S[0], H[1], M[1], S[1], H[2], M[2], S[2]);

    return 0;
}