#include <stdio.h>
void main()
{
    int i;

    for (i = 1; i <= 7; i++)
    {
        if (i % 2 != 0)
        {
            for (int j = 1; j <= 7 - i; j++)
            {
                printf(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                printf(" *");
            }
            printf("\n");
        }
    }
    for (i = 7; i >= 1; i--)
    {
        if (i % 2 != 0)
        {
            for (int j = 1; j <= 7 - i; j++)
            {
                printf(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                printf(" *");
            }
            printf("\n");
        }
    }
}