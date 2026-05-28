import java.util.Scanner;

public class Power {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number : ");
        int x = sc.nextInt();
        System.out.print("enter the power number : ");
        int n = sc.nextInt();
        int multi = 1;

        for(int i = 1 ; i <= n ; i++)
        {
            multi = multi * x ;
        }

        System.out.println("ans = " + multi);
    }
}