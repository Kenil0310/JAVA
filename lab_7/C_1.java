import java.util.Scanner;

class Complex_number
{
    double real;
    double imaginary;

    Complex_number()
    {
        this.real = 1;
        this.imaginary = 1;
    }
    Complex_number(double r , double i)
    {
        real = r ;
        imaginary = i;
    }
    void add(Complex_number c1 , Complex_number c2)
    {
         double c3 = c1.real + c2.real;
         double c4 = c1.imaginary + c2.imaginary;

         System.out.print("Real number is sum : " + c3);
         System.out.print("\nImaginary number is sum : " + c4);
    }
}
public class C_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double re,im;
        System.out.print("Enter the real NUmber : ");
        re = sc.nextDouble();
        System.out.print("Enter the imaginary : ");
        im = sc.nextDouble();

        Complex_number c1 = new Complex_number(re , im);
        Complex_number c2 = new Complex_number();
        c2.add(c1 , c2);
    }
}