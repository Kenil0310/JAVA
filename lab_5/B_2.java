import java.util.Scanner;

public class B_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String p = sc.next();

        int len = p.length();

        for(int i = 0 ; i < len ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print(p.charAt(j));
            }
            System.out.println();
        }
    }
}
