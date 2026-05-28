import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        System.out.println("enter the number : ");
        int b = sc.nextInt();
        System.out.println("enter the number : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest number is : " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is : " + b);
        } else

        {
            System.out.println("Largest number is : " + c);
        }
    }
}
