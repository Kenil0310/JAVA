import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the odd number : ");
        int num = sc.nextInt();
        
        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = 1 ; j <= num ; j++)
            {
                if(j == num || j == 1 || i == num)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = 1 ; j <= num ; j++)
            {
                
                if(j == (num / 2 + 1) || i == num)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
