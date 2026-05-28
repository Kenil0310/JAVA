
class Multithread implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 1 ; i <= 5 ; i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
        }   
        catch(Exception e)
        {
            System.out.println(e.getMessage());        
        }
    }
}
class Multithread2 implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 6 ; i <= 10 ; i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
        }   
        catch(Exception e)
        {
            System.out.println(e);     
        }
    }
}

public class A_2 {
    public static void main(String[] args) {
        Multithread m1 = new Multithread();
        Multithread2 m2 = new Multithread2();
        
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

    }
}
