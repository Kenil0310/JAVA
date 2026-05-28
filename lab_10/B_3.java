abstract class Vehical
{
    abstract public void startEngine();
    abstract public void stopEngine();
}
class Car extends Vehical
{
    public void startEngine() 
    {
        System.out.println("Start Engine in car");
    }
    public void stopEngine()
    {
        System.out.println("Stop Engine in car");
    }
}
class Motorcycle extends Vehical
{
    public void startEngine()
    {
        System.out.println("Start Engine in Motorcycle");
    }
    public void stopEngine()
    {
        System.out.println("Stop Engine in Motorcycle");
    }
}
public class B_3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.stopEngine();
        Motorcycle m = new Motorcycle();
        m.startEngine();
        m.stopEngine();
    }
}
