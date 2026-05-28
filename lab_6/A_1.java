import java.util.Scanner;

class Student{
    String name;
    int roll_no;
    double SPI;
    String course;

    void setter()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Enter student details---");

        System.out.print("Enter the Name : ");
        name = sc.next();

        System.out.print("Enter the Roll Number : ");
        roll_no = sc.nextInt();

        System.out.print("Enter the SPI : ");
        SPI = sc.nextDouble();

        System.out.print("Enter the Course : ");
        course = sc.next();
    }
    void getter()
    {
        System.out.println("----Student Details----");
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(SPI);
        System.out.println(course);
    }

}

public class A_1 {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        
        for(int i = 0 ; i < s.length ; i++)
        {
            s[i] = new Student();
            s[i].setter();
        }
        for(int i = 0 ; i < s.length ; i++)
        {
            s[i].getter();
        }
    }
}