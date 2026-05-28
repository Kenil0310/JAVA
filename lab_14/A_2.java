import java.io.*;

public class A_2 {
    public static void main(String[] args) {

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                // count occurrences
                int index;
                while ((index = line.indexOf("word1")) != -1) {
                    count++;
                    line = line.replaceFirst("word1", "word2");
                }
                            
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Total replacements: " + count);

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}
