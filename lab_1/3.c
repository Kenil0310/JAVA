#include<stdio.h>
void main()
{
    int num ;

    printf("enter the arry number : ");
    scanf("%d",&num);

    int i,arry[num],sum = 0;

    for(i = 0 ; i < num ; i++)
    {
        printf("enter the number : ");
        scanf("%d",&arry[i]);
    }
    for(i = 0 ; i < num ; i++)
    {
        if(arry[i] % 2 == 0)
        {
            sum = sum + arry[i] ; 
        }
    }
    printf("Sum of even number = %d",sum);

}
