import java.util.Scanner;

public class B_5 {
    public static void main(String[] args) {
        B_5 obj = new B_5();
        obj.leapyear();
    }
    void leapyear()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year : ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " is a Leap year");
        }
        else
        {
            System.out.println(year + " is not leap year");
        }
    }
}
