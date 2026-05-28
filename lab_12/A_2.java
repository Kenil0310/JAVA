import java.util.Scanner;

class InsufficientFundException extends Exception
{
    InsufficientFundException(String msg)
    {
        super(msg);
    }
}
class Account
{
    int Balance=5000;
    Scanner sc = new Scanner(System.in);
    int deposite,withdraw;

    void deposite()
    {
        System.out.println("Enter the deposite amount");
        deposite = sc.nextInt();

        Balance = Balance + deposite;

        System.out.println("Your final Balance is " + Balance);
    }

    void Withdraw()
    {
        System.out.println("Enter the amount to Withdraw");
        int withd = sc.nextInt();
    
        try
        {             
            if(Balance - withd < 1000)
             {
                throw new InsufficientFundException("Insufficient fund in your account");
             }
        }
        catch(InsufficientFundException e)
        {
            System.out.println(e.getMessage());
        }
        if(Balance - withd > 1000)
        {
            System.out.println("You withdraw succesfully...");
            Balance = Balance - withd;
            System.out.println("Final Balance: " + Balance);
        }
    }
}

public class A_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("enter the choice");
        System.out.println("1.Deposite");
        System.out.println("2.withdraw");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                    a.deposite();
                break;

            case 2:
                    a.Withdraw();
                break;
        
            default:
                System.out.println("Not valid");
                break;
        }
    }
}
