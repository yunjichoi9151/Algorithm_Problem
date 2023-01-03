#include <stdio.h>
#include <time.h>

int main()
{
    struct tm *t;
    time_t timer; 
    timer = time(NULL);
    t = localtime(&timer);

    if (t -> tm_hour < 15)
        printf("%d-%02d-%02d",t -> tm_year + 1900, t -> tm_mon + 1, t -> tm_mday);
    else
        printf("%d-%02d-%02d",t -> tm_year + 1900, t -> tm_mon + 1, t -> tm_mday + 1);

    return 0;
}
