import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        int a = 0,b = 1,temp,num;

        System.out.println("enter the number : ");
        num = sc.nextInt();

        for(int i = 1 ; i <= num ; i++)
        {
            System.out.print(a + " ");
            temp = a + b;
            b = a;
            a = temp;
        }
    }
}
