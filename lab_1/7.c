#include<stdio.h>
void main()
{
    int num;
    printf("enter the number : ");
    scanf("%d",&num);

    for(int i = 1 ; i <= num ; i++)
    {
        for(int k = 1 ; k <= i ; k++)
        {
            printf(" ");

        }
        for(int j = num ; j >= i ; j--)
        {
            printf(" *");
        }
        printf("\n");
    }

}