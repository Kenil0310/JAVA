import java.io.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class A_1 {
    public static void main(String[] args) {

        try {
            // create student
            Student s1 = new Student(1, "Rahul");

            // write to file
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
            bw.write(s1.id + " " + s1.name);
            bw.newLine();
            bw.close();

            // read from file
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;

            System.out.println("Student Data from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}