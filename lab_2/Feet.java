import java.util.Scanner;

public class Feet {
    public static void main(String[] args)
    {
        System.out.println("enter the Meters number : " );
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        double result = a * 3.2804;

        System.out.println(result+"Feets = ");

    }
}
