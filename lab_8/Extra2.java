import java.util.Scanner;

class bank_Account
{
    int acc_No;
    double balance;
    
    bank_Account(int no)
    {
        acc_No = no;
        balance = 1000;
    }
    void credit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of add Account : ");
        int credt = sc.nextInt(); 
        
    }
}

public class Extra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Number : ");
        int accno = sc.nextInt();

        bank_Account b1 = new bank_Account(accno);
    }
}
