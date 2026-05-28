import java.io.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class A_4 {
    public static void main(String[] args) {

        try {
            // create student object
            Student s1 = new Student(1, "Rahul");

            // write to file
            FileOutputStream fos = new FileOutputStream("student.txt");
            String data = s1.id + " " + s1.name;
            fos.write(data.getBytes());
            fos.close();

            // read from file
            FileInputStream fis = new FileInputStream("student.txt");
            int ch;

            System.out.println("Student Data from file:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}