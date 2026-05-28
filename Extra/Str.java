import java.util.Scanner;

public class Str {
    public static void main(Str[] args) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter the String - 1 : ");
        str1 = sc.nextLine();
        System.out.print("Enter the String - 2 : ");
        str2 = sc.nextLine();

        System.out.println("Length of String");
        System.out.println("String - 1 : " + str1.length());
        System.out.println("String - 2 : " + str2.length());
        System.out.println();

        System.out.println("Concat of String");
        System.out.println(str1.concat(str2));
        System.out.println();

        System.out.println("Upper case of String");
        System.out.println(str1.toUpperCase());
        System.out.println();

        System.out.println("Lower case of String");
        System.out.println(str1.toLowerCase());
        System.out.println();

        System.out.println("check the Equal of String ");
        System.out.println(str1.equals(str2));
        System.out.println();

        System.out.println("Egnore case of string");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println();

        System.out.println("find the character of string");
        System.out.println(str1.indexOf('r'));
        System.out.println(str2.indexOf('i'));
        System.out.println();





    }
}
    