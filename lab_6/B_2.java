import java.util.*;

class Employee {
    String name;
    String job_title;
    double salary;

    Scanner sc = new Scanner(System.in);

    void getter() {
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your Job Title :  ");
        job_title = sc.nextLine();
        System.out.print("Enter your Salary : ");
        salary = sc.nextDouble();
        System.out.println();
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Job Title : " + job_title);
        System.out.println("Salary : " + salary);
        System.out.println();
    }

    void update_salary() {
        System.out.print("Enter your Update Salary : ");
        salary = sc.nextDouble();
        System.out.println();
    }

    void salary() {
        System.out.println("Name : " + name);
        System.out.println("Job Title : " + job_title);
        System.out.println("Update Salary : " + salary);
    }

}

public class B_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getter();
        e1.display();
        e1.update_salary();
        e1.salary();
    }
}
