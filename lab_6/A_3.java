import java.util.Scanner;

class BankDemo {
    int AccNum;
    String accType;
    Double Balance;

    void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of Account : ");
        accType = sc.nextLine();
        System.out.print("Enter the Account Number : ");
        AccNum = sc.nextInt();
        System.out.print("Enter the Balance of Account : ");
        Balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Account Number : " + AccNum);
        System.out.println("Account Type : " + accType);
        System.out.println("Balance : " + Balance);
        System.out.println();
    }

}

public class A_3 {
    public static void main(String[] args) {
        BankDemo[] b1 = new BankDemo[2];

        for (int i = 0; i < b1.length; i++) {
            b1[i] = new BankDemo();
            b1[i].setter();
            b1[i].display();
        }

    }
}
