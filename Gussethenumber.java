import java.util.Random;
import java.util.Scanner;

public class Gussethenumber {
    
    public static void main(String[] args)
    {
        Random random = new Random();                 
        int randomnumber = random.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("welcome to the number gussing game....");
        System.out.println("Guess a number between 1 to 100");

        while(guess != randomnumber)
        {
            guess = sc.nextInt();
            attempts++;

            if(guess > randomnumber)
            {
                System.out.println("Too High! Try again");
            }
            else if(guess < randomnumber)
            {
                System.out.println("too Low! Try again");
            }
            else
            {
                System.out.println("Congretulation! You guessed the number");
                System.out.println("number of attempts : " + attempts);
            }
        }
    } 
}