import java.util.Scanner;

class BankAccount
{
    long acc_no;
    double balance;
    static String bank_name;
    static double interest;

    static void getter1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Bank Name : ");
        bank_name = sc.nextLine();

        System.out.print("Enter the Interest Rate : ");
        interest = sc.nextDouble();
    }
    void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Number : ");
        acc_no = sc.nextLong();
        System.out.print("Enter the Balance : ");
        balance = sc.nextDouble();
    }
    void setter()
    {
        System.out.println("---Bank Details---");
        System.out.println("Account Number : " + acc_no);
        System.out.println("Account Balance : " + balance);
        System.out.println("Bank Name : " + bank_name);
        System.out.println("Interest Rate : " + interest);
        System.out.println();
    }
}

public class A_3 {
    public static void main(String[] args) {

        BankAccount b1[] = new BankAccount[3];
        BankAccount b2 = new BankAccount();
        b2.getter1();
        for(int i = 0 ; i < b1.length ; i++)
        {
            b1[i] = new BankAccount();
            b1[i].getter();
            b1[i].setter();
        }
    }
}
