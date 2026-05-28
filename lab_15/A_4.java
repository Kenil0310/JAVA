import java.util.*;

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

public class A_4 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        // add students
        list.add(new Student(1, "Rahul", 101, 8.5));
        list.add(new Student(2, "Amit", 102, 7.8));
        list.add(new Student(3, "Neha", 103, 9.1));

        // sort by SPI (simple)
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.spi > s2.spi) return 1;
                else if (s1.spi < s2.spi) return -1;
                else return 0;
            }
        });

        // display
        System.out.println("Sorted by SPI:");

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.rollNo + " " + s.spi);
        }
    }
}