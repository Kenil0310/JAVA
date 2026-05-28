import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();


        for(int i = 1 ; i <= num ; i++)
        {
            //upper part
            //right half pyramid
   
            if(i % 2 != 0)
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            else
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 == 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }

            //Space logic

            for(int j = 1 ; j <= 2 * (num - i) ; j++)
            {
                System.out.print("  ");
            }

            //Left half pyramid

            if(i % 2 != 0)
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            else
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }

        // Lower part


        for(int i = num - 1 ; i >= 1 ; i--)
        {

            // Right half pyramid +
            if(i % 2 != 0)
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            else
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 == 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
             //Space logic

            for(int j = 1 ; j <= 2 * (num - i) ; j++)
            {
                System.out.print("  ");
            }

            //Left half pyramid

            if(i % 2 != 0)
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            else
            {
                for(int j = 1 ; j <= i ; j++)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        
   
    }
}