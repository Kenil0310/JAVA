#include <stdio.h>
void main()
{
    int i;
    for (int i = 1; i <= 5; i++)
    {
        for (int k = 1; k <= 5 - i; k++)
        {
            printf(" ");
        }
        for (int k = 1; k <= 5; k++)
        {
            printf("*");
        }
        printf("\n");
    }
}