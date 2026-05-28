import java.util.Scanner;

public class C_7 {
    public static void main(String[] args) {
        C_7 obj = new C_7();
        obj.threedigitprime();
    }
    void threedigitprime()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 3 digit of starting number : ");
        int start = sc.nextInt();

        System.out.print("Enter the 3 digit of ending number : ");
        int end = sc.nextInt();

        for(int i = start ; i <= end ; i++)
        {   
            int prime = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                {
                    prime++;
                }
            }
            if(prime == 2)
            {
                System.out.println(i);
            }
        }
    }    
}
