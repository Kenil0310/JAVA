interface Transport
{
    void deliver();
}
abstract class Animal
{
    abstract void name();
}
class Tiger extends Animal
{
    public void name()
    {
        System.out.println("Animal name = Tiger");
    }
}
class Camel extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("Transport deliver = camel");
    }
    public void name()
    {
        System.out.println("Animal name = Camel");
    }
}
class Deer extends Animal
{
    public void name()
    {
        System.out.println("Animal name = Deer");
    }
}
class Donkey extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("Transport deliver = Donkey");
    }
    public void name()
    {
        System.out.println("Animal name = Donkey");
    }
}

public class A_3 {
    public static void main(String[] args) {
        Animal[] a = new Animal[4];
        
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
    
        a[0].name(); 
        ((Transport) a[1]).deliver();
        a[1].name(); 
        a[2].name(); 
        a[3].name(); 
        ((Transport) a[3]).deliver();
    }
}