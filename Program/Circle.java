

import java.util.Scanner;

public class Circle {
    public static double Radius(double radius)
    {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;  

        if(area > circumference)
        {
            return area;
        }
        else
        {
            return circumference;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : " );
        double radius = sc.nextDouble();

        double result = Radius(radius);
        System.out.println("Greater is : " + result);


    }
}
