import java.io.FileReader;
import java.io.IOException;

public class A_3 {
    public static void main(String[] args) {

        int count = 0;

        try {
            FileReader fr = new FileReader(args[0]);
            int ch;

            while ((ch = fr.read()) != -1) {
                if (ch == '5') 
                {
                    count++;
                }
            }

            fr.close();

            System.out.println("Number of 5's: " + count);

        } catch (Exception e) {
            System.out.println("File not found or error!");
        }
    }
}