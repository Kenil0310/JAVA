import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        A_2 obj = new A_2();
        obj.oddeven();
    }
    void oddeven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num % 2 == 0)    
        {
            System.out.println(num + " is a even number");
        }
        else
        {
            System.out.println(num + " is a odd number");
        }

    }
}
