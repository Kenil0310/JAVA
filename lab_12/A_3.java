import java.util.Scanner;

public class A_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a = sc.nextInt();

        try
        {
            if(a < 18)
            {
                throw new Exception("Age is not valid");
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
