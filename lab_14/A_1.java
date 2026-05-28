import java.io.FileReader;
import java.io.IOException;

public class A_1 {
    public static void main(String[] args) {

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            FileReader fr = new FileReader("input.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                characters++;

                // count lines
                if (ch == '\n') {
                    lines++;
                }

                // simple word logic (count spaces)
                if (ch == ' ' || ch == '\n' || ch == '\t') {
                    words++;
                }
            }

            fr.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}