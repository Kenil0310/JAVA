

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int zero = 0;
        char choise;

        do{
            System.out.println("Enter a number : ");
            int num = sc.nextInt();

            if(num > 0)
            {
                pos++;
            }
            else if(num < 0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
            System.out.println("enter another number(yes/no) : ");
            choise = sc.next().charAt(0);
        }while(choise == 'y' || choise == 'Y');

        System.out.println("Total positive number : " + pos);
        System.out.println("Total negative number : "+ neg);
        System.out.println("Total zero number :" + zero);

    }
}
