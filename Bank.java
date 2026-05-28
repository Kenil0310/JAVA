import java.util.Scanner;

class bnk
 {
    int acc_no;
    double balance;
    int pin;

    void setdata()
    {
        acc_no = 123456789;
        balance = 1000000.0;
        pin = 1234;
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pin : ");
        int num = sc.nextInt();
        
        if(num == pin)
        {
            System.out.println("Account number : " + acc_no);
            System.out.println("Balance : " + balance);
        }
        else
        {
            System.out.println("Invalid pin");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        bnk b1 = new bnk();
        b1.setdata();
        b1.display();
    }
}
