class Odd extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1 ; i <= 20 ; i+=2)
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
class Even extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 2 ; i <= 20 ; i+=2)
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
public class A_4 {
    public static void main(String[] args) {
        Odd o1 = new Odd();
        Even e1 = new Even();

        o1.start();
        e1.start();
    }
}
