import java.util.Scanner;

public class B_6 {
    public static void main(String[] args) {
        B_6 obj = new B_6();
        obj.palindrome();
    }
    void palindrome()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int rem,temp,sum=0;
        temp = num;

        while (num != 0) {
            
        rem = num % 10;
        sum = sum * 10 + rem;
        num = num / 10;

        }
        if(sum == temp)
        {
            System.out.println(temp + " is a Palindrome number");
        }
        else
        {
            System.out.println(temp + " is not palindrome number");
        }
    }
}
