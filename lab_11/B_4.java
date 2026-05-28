interface Car
{
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}
class Swift implements Car
{
     public void moveForward()
     {
        System.out.println("Swift move forward");
     }
    public void moveBackward()
    {
        System.out.println("Swift move backward");
    }
    public void moveLeft()
    {
        System.out.println("swift moveleft");
    }
    public void moveRight()
    {
        System.out.println("swift move right");
    }
    public void applyBreak()
    {
        System.out.println("swift apply break");
    }
}
class Thar implements Car
{
    public void moveForward()
     {
        System.out.println("Thar move forward");
     }
    public void moveBackward()
    {
        System.out.println("Thar move backward");
    }
    public void moveLeft()
    {
        System.out.println("Thar moveleft");
    }
    public void moveRight()
    {
        System.out.println("Thar move right");
    }
    public void applyBreak()
    {
        System.out.println("Thar apply break");
    }
}

public class B_4 {
    public static void main(String[] args) {
        Swift s1 = new Swift();
        s1.applyBreak();
        s1.moveBackward();
        s1.moveForward();
        s1.moveLeft();
        s1.moveRight();
        System.out.println();
        Thar t1 = new Thar();
        t1.applyBreak();
        t1.moveBackward();
        t1.moveForward();
        t1.moveLeft();
        t1.moveRight();
    }
}
