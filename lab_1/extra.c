#include<stdio.h>
void main()
{
    int i,j,k;

    for(i = 1 ; i <= 4 ; i++)
    {
        for(j = 1 ; j <= i ; j++) 
        {
            printf("*");
        }
        for(j = 1 ; j <= 2*(4 - i) ; j++)
        {
            printf(" ");
        }
        for(j = 1 ; j <= i ; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    for(i = 4 ; i >= 1 ; i--)
    {
        for(j = 1 ; j <= i ; j++)
        {
            printf("*");
        }
        for(j = 1 ; j <= 2*(4 - i); j++)
        {
            printf(" ");
        }
        for(j = 1 ; j <= i ; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    
}