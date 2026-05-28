import java.util.Scanner;

class Employee 
{
    Scanner sc = new Scanner(System.in);
     String name1;
     String name2;
    String wrk;
    double salary;

    void work()
    {
        System.out.print("Enter the Name of Employee : ");
        name1 = sc.next();
        System.out.print("Enter the Work of Employee : ");
        wrk = sc.next();
    }
    void getsalary()
    {
        System.out.print("Enter the Salary of Employee : ");
        salary = sc.nextDouble();
    }
}
class HRManager extends Employee
{
    void work()
    {
        super.work();
    }
    void AddEmployee()
    {
        System.out.println("Enter the name of New Employee : ");
        name2 = sc.next();
    }

    void Display()
    {
        System.out.println("----Employee Details----");
        System.out.println("Employee Name : " + name1);
        System.out.println("Employee Work : " + wrk);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Add Employee name : " + name2);

    }
}
public class A_2 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.getsalary();
        hr.AddEmployee();
        hr.Display();
    } 
}
