import java.util.Scanner;

public class A_1 {
    public static void main(String[] args)
    {
        A_1 marks = new A_1();
        marks.Percentage();
    }
    void Percentage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five subject of marks ");
        System.out.println(("Enter the marks of JAVA : "));
        int m1 = sc.nextInt();
        System.out.println(("Enter the marks of C : "));
        int m2 = sc.nextInt();
        System.out.println(("Enter the marks of PYTHON : "));
        int m3 = sc.nextInt();
        System.out.println(("Enter the marks of JAVASCRIPT : "));
        int m4 = sc.nextInt();
        System.out.println(("Enter the marks of WD : "));
        int m5 = sc.nextInt();

        float percentage = (m1 + m2 + m3 + m4 + m5)/5;
        
        if(percentage >= 60)
        {
            System.out.println("First Divison");
        }
        else if(percentage >= 50 && percentage <= 59)
        {
            System.out.println("second division");
        }
        else if(percentage >= 40 && percentage <= 49)
        {
            System.out.println("Third division");
        }
        else if(percentage < 40)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
