import java.util.Scanner;

public class A_3 {
    public static void main(String[] args) {
        A_3 obj = new A_3();
        obj.maximun();
    }
    void maximun()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.print("Enter the number : ");
        int b = sc.nextInt();
        System.out.print("Enter the number : ");
        int c = sc.nextInt();

        System.out.print("Max is = "+((a>b&&a>c)?a:(b>a&&b>c)?b:c)); 
    }
}
