

import java.util.Scanner;

public class Adult {
    public static int PrintAge(int age)
    {
        
        if(age > 18)
        {
            return 1;
        }
        else
        {
            return 0;
        }    
    }

     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();

         int reslt = PrintAge(age);
         System.out.println("Person is eligible to vote " + reslt);
     }
}