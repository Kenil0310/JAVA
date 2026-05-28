abstract class Vegetable
{
    String color;

    abstract public String toString();
}
class Potato extends Vegetable
{
    Potato()
    {
        color = "Light yellow"; 
    }
    public String toString() 
    {
        return "Vegetable name = Potato\nColor = " + color;
    }
}
class Brinjal extends Vegetable
{
    Brinjal()
    {
        color = "Purple";
    }
    public String toString() {
        return "Vegetable name = Brinjal\nColor = " + color;
    }
}
class Tomato extends Vegetable
{
    Tomato()
    {9
        color = "Red";
    }
    public String toString() {
        return "Vegetable name = Tomato\nColor = " + color;
    }
}

public class A_1 {
    public static void main(String[] args) {
        Potato p = new Potato();
        System.out.println(" " + p.toString());
        Brinjal b = new Brinjal();
        System.out.println(" " + b.toString());
        Tomato t = new Tomato();
        System.out.println(" " + t.toString());
    }
}
