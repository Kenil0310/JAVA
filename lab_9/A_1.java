import java.util.Scanner;

class Student
{
    long id_no;
    int no_of_subject;
    String[] subject_code;
    int[] subject_credit;
    String[] gread;
    float SPI;

    int Total_mark;
    int obtaind_mark;
    Student(long id_no , int no_of_subject , String subject_code[] , int subject_creadit[] , String gread[])
    {
        this.id_no = id_no;
        this.no_of_subject = no_of_subject;
        this.subject_code=subject_code;
        this.subject_credit=subject_creadit;
        this.gread=gread;
    }

    void Total_marks()
    {
        for(int i = 0 ; i < no_of_subject ; i++)
        {
            Total_mark = Total_mark + subject_credit[i] * 10;
        }
    }

    void Obtaind_marks()
    {
        for(int i = 0 ; i < no_of_subject ; i++)
        {
            if(gread[i].equals("A"))
            {
                obtaind_mark = obtaind_mark + subject_credit[i]*10;
            }
            else if (gread[i].equals("B")) 
            {
                obtaind_mark = obtaind_mark + subject_credit[i]*8;
            }
            else if(gread[i].equals("C"))
            {
                obtaind_mark = obtaind_mark + subject_credit[i]*6;
            }
            else if(gread[i].equals("D"))
            {
                obtaind_mark = obtaind_mark + subject_credit[i]*4;
            }
            else if(gread[i].equals("E"))
            {
                obtaind_mark = obtaind_mark + subject_credit[i]*2;
            }
            else 
            {
                obtaind_mark = obtaind_mark + 0;
            }
        }
    }
    void Obtainde_SPI()
    {
        SPI = ((float)obtaind_mark / Total_mark) * 10;
    }

    void displayStudent_spi()
    {
        System.out.println("ID NUMBER IS: "+ id_no);
        System.out.println("SPI IS "+ SPI);
    }
}
public class A_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of subject");
        int no_of_subject = sc.nextInt();

        Student[] s = new Student[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("Enter the student id: ");
            long id = sc.nextLong();

            String[] subject_code = new String[no_of_subject];
            int[] subject_credit = new int[no_of_subject];
            String[] gread = new String[no_of_subject];
        

            for(int j = 0 ; j < no_of_subject ; j++)
            {
                System.out.println("Enter the subject code: ");
                subject_code[j] = sc.next();
               
                System.out.println("Enter the creadit of ");
                subject_credit[j] = sc.nextInt();
    
                System.out.println("Enter the grade of ");
                gread[j] = sc.next();
                
            }

            s[i] = new Student(id, no_of_subject, subject_code,subject_credit,gread);

            s[i].Total_marks();
            s[i].Obtaind_marks();
            s[i].Obtainde_SPI();
        }

        for(int i = 0 ; i < n ; i++)
        {
            s[i].displayStudent_spi();
        }
    }   
}