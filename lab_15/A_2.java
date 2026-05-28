import java.io.File;

public class A_2 {
    public static void main(String[] args) {

        File f = new File(args[0]);

        if (f.exists()) {

            if (f.isFile()) {
                System.out.println("It is a file");
                System.out.println("Size: " + f.length() + " bytes");
            }

            else if (f.isDirectory()) {
                System.out.println("It is a directory");
                String[] list = f.list();

                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i]);
                }
            }

        } else {
            System.out.println("File or directory does not exist");
        }
    }
}