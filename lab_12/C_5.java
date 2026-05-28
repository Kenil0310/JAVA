import java.util.Scanner;

public class C_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        try
        {
            if(a < 10 || a > 50)
            {
                throw new Exception("Out of range");
            }
            else
            {
                System.out.println(a*a);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
}