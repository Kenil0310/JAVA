class Mythread1 implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("Good Morning\n");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Mythread2 implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
            System.out.println("Good Afternoon");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
} 
public class A_3 {
    public static void main(String[] args) {
        Mythread1 m1 = new Mythread1();
        Mythread2 m2 = new Mythread2();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
        
    }
}
