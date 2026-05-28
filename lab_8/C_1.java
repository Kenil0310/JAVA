import java.util.Scanner;

class House
{
    private String address;
    private int num_rooms;
    private double area;
    private double price_square;

    void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Address of house : ");
        address = sc.nextLine();
        System.out.print("Enter the Number of Room : ");
        num_rooms = sc.nextInt();
        System.out.print("Enter the Number of area : ");
        area = sc.nextDouble();
        System.out.print("Enter the price per square meter : ");
        price_square = sc.nextDouble();
    }
    double  calculatePrice()
    {
        double price = area * 1500;
        return price;
    }
    void setter()
    {
        System.out.println("-----House Details-----");
        System.out.println("Address of House : " + address);
        System.out.println("Number of Room : " + num_rooms);
        System.out.println("Price of house : " + calculatePrice());
    }
}
public class C_1 {
    public static void main(String[] args) {
        House h1 = new House();
        h1.getter();
        h1.setter();
    }
}
