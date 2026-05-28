import java.util.Scanner;

class Book
{
    private String  author_name;

    Book(String author_name)
    {
        this.author_name = author_name;
    }
    void display()
    {  
        System.out.println("Author Name : " + author_name);
    }
}   
class Book_publication extends Book
{
    private String Title;

    Book_publication(String author_name,String Title)
    {
        super(author_name);
        this.Title = Title;
    }
    void display()
    {
        System.out.println("Title : " + Title);
        super.display();
    }
}
class Paper_publication extends Book
{
    private String Title;

    Paper_publication(String author_name,String Title)
    {
        super(author_name);
        this.Title = Title;
    }
    void display()
    {
        System.out.println("Title : " + Title);
        super.display();
    }
}
public class B_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Author Name : ");
        String author_name = sc.nextLine();
        
        Book b = new Book(author_name);

        System.out.print("Enter your Book Title : ");
        String title1 = sc.nextLine();

        Book_publication bp = new Book_publication(author_name, title1);
        
        System.out.print("Enter your Paper Title : ");
        String title2 = sc.nextLine();
        
        Paper_publication pb = new Paper_publication(author_name, title2);
        
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                bp.display();
                break;
            case 2:
                pb.display();    
            default:
                break;
        }
    }
}
