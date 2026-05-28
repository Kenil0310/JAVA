
import java.util.Scanner;

public class Cnvrt_upp_low {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        String result = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            char c = str.charAt(i);
            if (i % 2 == 0) 
            {
                result += Character.toUpperCase(c);
            }
            else
            {
                result += Character.toLowerCase(c);
            }
        }
        System.out.println(result);

    }
}
