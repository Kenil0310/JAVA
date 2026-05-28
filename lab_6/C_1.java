import java.util.Scanner;

class Length
{
    String sentence;

    void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        sentence = sc.nextLine();
        int count = 0;
        
        for(int i = 0 ; i < sentence.length() ; i++)
        {
            count++;
        }
        System.out.println("Length of string : " + count);

        System.out.print("Second half of the string : ");
        for(int i = count / 2 ; i < sentence.length() ; i++)
        {
            System.out.print("" + sentence.charAt(i));
        }
    }
}
public class C_1 {
    public static void main(String[] args) {
        Length l1 = new Length();
        l1.getter();
    }
}
