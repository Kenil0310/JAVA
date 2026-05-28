import java.util.Scanner;

class Area
{
    static final double PI = 3.14159;
    float radius;

    void calculate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        radius = sc.nextFloat();

        System.out.print("Radius : " + (PI * radius * radius));
    }
}
public class B_1 {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.calculate();
    }
}
