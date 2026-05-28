

import java.util.Scanner;

public class SumOfOdd 
{
    public static void PrintOddSum(int num)
    {
        int odd = 0;
       for(int i = 1 ; i <= num ; i++)
        {
            if(i % 2 != 0)
            {
                odd = odd + i;
            }
        } 
        System.out.println("Sum of odd numbers : " + odd);
    }
    public static void main(String[] arg)
    {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        PrintOddSum(num);

        sc.close();

    }
    
}
