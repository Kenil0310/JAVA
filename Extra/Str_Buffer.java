

import java.util.Scanner;

public class Str_Buffer {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("darshan");
        StringBuffer str2 = new StringBuffer("University");

        System.out.println("Append of String");
        System.out.println(str1.append(str2));
        System.out.println();

        System.out.println("Insert of string");
        System.out.println(str1.insert(2,'r'));
        System.out.println();

        System.out.println("Replace of string");
        System.out.println(str2.replace(1, 5, "aaa"));
        System.out.println();

        System.out.println("Delete of string");
        System.out.println(str1.delete(1,3));
        System.out.println();

        System.out.println("Reverse of string");
        System.out.println(str1.reverse());
    }
}
