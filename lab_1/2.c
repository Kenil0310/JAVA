#include<stdio.h>
void main()
{
    int num;
    printf("enter the number : ");
    scanf("%d",&num);
    int rem,sum = 0;

    while (num != 0)
    {
       rem = num % 10 ;
       sum = sum + rem;
       num = num / 10;
    }
    printf("sum = %d",sum);
    
    
}