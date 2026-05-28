import java.util.Scanner;

class Student
{
    String name;
    int roll_no;
    static String time;

    static void Time()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the college time : ");
        time = sc.nextLine();
    }
    void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name : ");
        name = sc.next();
        System.out.print("Roll no : ");
        roll_no = sc.nextInt();     
    }
}
class Display extends Student
{
    void setter()
    {
        super.getter();
    }
    void display()
    {
        System.out.println();
        System.out.println("---Student Details---");
        System.out.println("Student name : " + name);
        System.out.println("Roll number  : " + roll_no);
        System.out.println("College Time : " + time);
    }
}
public class A_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Student : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        Display d1 = new Display();
        d1.Time();

        for(int i = 0 ; i < arr.length ; i++)
        {
            d1.setter();
            d1.display();
            System.out.println();
        }
    }
}
