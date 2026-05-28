import java.util.Scanner;

public class  Arithmetic_opration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 =(int)(Math.random() * 100);

        System.out.println("What is " + number1 + " - " + number2 + " ? ");
        System.out.print("answer = ");

        int answer = sc.nextInt();

        if((number1 - number2) == answer)
        {
            System.out.println("Your answer is correct!");
            System.out.println("Congratulation!");
        }
        else
        {
            System.out.println("Your answer is wrong");
            System.out.println("Please try again");
            System.out.println("solution is " + number1 + " - " + number2 + (number1 - number2));
        }
    }
}
