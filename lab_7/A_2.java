import java.util.Scanner;

class Angle
{
    int hour,minute;

    void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hours : ");
        hour = sc.nextInt();
        System.out.print("Enter the Minutes : ");
        minute = sc.nextInt();
    }
    void setter()
    {
        System.out.print("Angle = " + ang());
    }   
    double ang()
    {
        double m , h , result;
        m = minute * 6;
        h = (hour * 30) + (minute * 0.5);

         return result = Math.abs(h - m); 
    }

}

public class A_2 {
    public static void main(String[] args) {
        Angle a1 = new Angle();
        a1.getter();
        a1.setter();
    }
}
