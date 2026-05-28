import java.util.Scanner;

public class Butterfly_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                  System.out.print("* ");
            }
            for(int j = 1 ; j <= (2 * (num - i)) ; j++)
            {
                System.out.print("  ");
            }
            
            for(int j = 1 ; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
           for(int i = num - 1 ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1 ; j <= 2 * (num - i) ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }



    }
}
