import java.util.Scanner;

public class Calculator {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float num1 = sc.nextFloat();
        System.out.print("enter the number : ");
        float num2 = sc.nextFloat();

        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("number of sum : " + (num1+num2));
                break;
            case '-':
                System.out.println("number of substraction : " +(num1 - num2));
                break;
            case '*':
                System.out.println("enter the multification : "+ (num1 * num2));
                break;    
            case '/':
                System.out.println("enter the divison : "+ (num1 / num2));
                break;
            default:
                System.out.println("data not found");
                break;
        }
    }
}
