import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the length : ");
        float length = sc.nextFloat();
        System.out.print("enter the width : ");
        float width = sc.nextFloat();

        System.out.println(" calculate the area of Rectangle : "+ (length * width));
        

    }   
}
