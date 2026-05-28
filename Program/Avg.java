

import java.util.Scanner;

public class Avg 
{
    public static void average(int num1,int num2,int num3)
    {
        int avrg = (num1 + num2 + num3) / 3 ;

        System.out.println("Average = " + avrg);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();

        average(num1,num2,num3);


        sc.close();
    }
}
