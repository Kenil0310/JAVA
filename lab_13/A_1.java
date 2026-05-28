class Multithread1 extends Thread
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
class Multithread2 extends Thread
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


class A_1
{
    public static void main(String[] args) {
        Multithread1 m1 = new Multithread1();
        Multithread2 m2 = new Multithread2();
        m1.start();
        m2.start();
    }
}