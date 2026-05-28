

import java.util.Scanner;

public class GreaterF {

    public static void Grterf(int a,int b)
    {
        if(a > b)
        {
            System.out.println(a + " is Greater");
        }
        else
        {
            System.out.println(b + " is greater");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the two numbers : ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();


        Grterf(a,b);
        

    }
}
