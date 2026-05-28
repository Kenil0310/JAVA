

import java.util.Scanner;

class Book 
{
    int isbn;
    String title;

    Book(int i,String ti)
    {
        isbn = i ;
        title = ti;
    }
    void display()
    {
        System.out.println("Isbn = " + isbn);
        
        System.out.print("Title = " + title);
    }
    
}

public class Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Isbn : ");
        int isb = sc.nextInt();
        System.out.print("Enter the Title : ");
        String tit = sc.next();

        Book b1 = new Book(isb , tit);
        b1.display();

    }
}
