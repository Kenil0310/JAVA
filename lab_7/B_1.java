import java.util.Scanner;

class vowels {
    String sentence;

    void display() {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Sentence : ");
            sentence = sc.nextLine();

            if (sentence.equalsIgnoreCase("Quit")) {
                break;
            }

            for (int i = 0; i < sentence.length(); i++) 
            {
                 char ch = sentence.charAt(i);

                if (ch == 'A' || ch == 'a') {
                    count1++;
                } else if (ch == 'E' || ch == 'e') {
                    count2++;
                } else if (ch == 'I' || ch == 'i') {
                    count3++;
                } else if (ch == 'O' || ch == 'o') {
                    count4++;
                } else if (ch == 'U' || ch == 'u') {
                    count5++;
                }
            }
        }
        
        System.out.println("A || a : " + count1);
        System.out.println("E || e : " + count2);
        System.out.println("I || i : " + count3);
        System.out.println("O || o : " + count4);
        System.out.println("U || u : " + count5);

    }
}

public class B_1 {
    public static void main(String[] args) {
        vowels v1 = new vowels();
        v1.display();
    }
}
