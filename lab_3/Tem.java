

import java.util.Scanner;

public class Tem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of temperature");
        System.out.print("Fahrenheit to Celsius that enter - C ");
        System.out.print(" Celsius to  Fahrenheit that enter - F ");
        char result = sc.next().charAt(0);
        switch (result) {
            case 'C':
                System.out.print("Enter the Fahrenheit : ");
                float f = sc.nextFloat();
                float c = (f - 32 * 5 / 9);
                System.out.println("Fahrenheit to Celsius : " + c);
                break;
            case 'F':
                System.out.print("Enter the Celsius : ");
                float c1 = sc.nextFloat();
                float f1 = ((c1 * 9 / 5) + 32) ;
                System.out.println("Fahrenheit to Celsius : " + f1);
                break;    
        
            default:
                System.out.println("Not valid");
                break;
        }
    }
}
