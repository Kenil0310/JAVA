class Mythread1 extends Thread
{
    public void run()
    {
        while (true) {
        try
        {
            int num = (int)(Math.random() * 10);
            if(num % 2 == 0)
            {
                new Even(num).start();
            }
            else
            {
                new Odd(num).start();
            }
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        }
    }
}
class Even extends Thread
{
    int n;
    Even(int num)
    {
        this.n = num;
    }
    public void run()
    {
        System.out.println("Even = " + (n * n));
    } 
}
class Odd extends Thread
{
    int n;
    Odd(int num)
    {
        this.n = num;
    }
    public void run()
    {
        System.out.println("Odd = " + (n * n * n));
    }
}
public class B_2 
{
    public static void main(String[] args) 
    {
        Mythread1 m1 = new Mythread1();
        m1.start();
    }
}
