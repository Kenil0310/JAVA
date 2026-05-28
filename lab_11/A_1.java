
interface A
{
    int a = 10;
    void display();
}
interface A1 extends A
{
    int a1 = 20;
    void A_1();
}
interface A2 extends A
{
    int a2 = 30;
    void A_2();
}
interface A12 extends A1,A2
{
    int a12 = 40;
    void A_12();
}                                   
class B implements A12
{
    public void display()
    {
        System.out.println("a = " + a);
    }
    public void A_1()
    {
        System.out.println("a_1 = " + a1);
    }
    public void A_2()
    {
        System.out.println("a_2 = " + a2);
    }
    public void A_12()
    {
        System.out.println("a_12 = " + a12);
    }
}
public class A_1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.display();
        b1.A_1();
        b1.A_2();
        b1.A_12();
    }
}
