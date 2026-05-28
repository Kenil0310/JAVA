
import java.util.Scanner;

class Circle {
    double radius;

    void getter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        radius = sc.nextDouble();
    }

    void setter() {
        System.out.println(display());
    }
    Double display() {
        return Math.PI * radius * radius;
    }
}

public class A_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getter();
        c1.setter();
    }
}
