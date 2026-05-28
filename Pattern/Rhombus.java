import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = 1 ; j <= i - 1 ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= 5 ; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
