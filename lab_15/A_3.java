import java.util.ArrayList;

class Student {
    int id;
    String name;
    int rollNo;
    double spi;

    Student(int id, String name, int rollNo, double spi) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.spi = spi;
    }
}

public class A_3 {
    public static void main(String[] args) {

        // create ArrayList
        ArrayList<Student> list = new ArrayList<>();

        // add students
        list.add(new Student(1, "Rahul", 101, 8.5));
        list.add(new Student(2, "Amit", 102, 7.8));
        list.add(new Student(3, "Neha", 103, 9.1));

        // display students
        System.out.println("Student List:");

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.rollNo + " " + s.spi);
        }
    }
}