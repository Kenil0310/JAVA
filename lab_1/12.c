#include<stdio.h>
void main()
{
    int num;
    printf("enter the number : ");
    scanf("%d",&num);

    for(int i = 1 ; i <= num ; i++)
    {
        for(int j = 1 ; j <= i ; j++)
        {
            printf(" ");
        }
        for(int k = num ; k >= i ; k--)
        {
            if(i % 2 == 0)
            {
                printf(" #");
            }
            else
            {
                printf(" *");
            }
        }
        printf("\n");
    }
}