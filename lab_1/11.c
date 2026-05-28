#include<stdio.h>
#include<string.h>
void main()
{
    char s1[100],num=0;

    printf("Enter the name : ");
    gets(s1);

    num = strlen(s1);

    printf("string length = %d\n",num);

    for(int i = 0 ; i < num ; i++)
    {
        for(int k = 1 ; k < num - i ; k++)
        {
            printf(" ");
        }
        for(int j = 0 ; j <= i ; j++)
        {
            printf(" %c",s1[j]);
        }
        printf("\n");
    }
}