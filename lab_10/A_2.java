abstract class BankAccounts
{
    abstract public void deposit();
    abstract public void withdraw();
}
class SavingsAccount extends BankAccounts
{
    public void deposit() 
    {
        System.out.println("Your money is Deposit in saving account");
    }
    public void withdraw() 
    {
        System.out.println("Your money is withdraw in saving account");    
    }
}
class CurrentAccount extends BankAccounts
{
    public void deposit() 
    {
        System.out.println("Your money is deposit in current account");    
    }
    public void withdraw() 
    {
        System.out.println("Your money is withdraw in current account");    
    }
}

public class A_2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
        CurrentAccount c = new CurrentAccount();
        c.deposit();
        c.withdraw();
    }
}
