import java.util.Scanner;

class Time
{
    int hour,minute,second;

    Time()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hours : ");
        hour = sc.nextInt();
        System.out.print("Enter the Minute : ");
        minute = sc.nextInt();
        System.out.print("Enter the Seconds : ");
        second = sc.nextInt();
    }
    void add_time(Time t1 , Time t2)
    {
        int h = t1.hour + t2.hour;
        int m = t1.minute + t2.minute;
        int s = t1.second + t2.second;

        while (s >= 60) 
        {
            m++;
            s-=60;            
        }
        while (m >= 60)
        {
            h++;
            m-=60;   
        }
        System.out.println("HH : " + h);
        System.out.println("MM : " + m);
        System.out.println("SS : " + s);
    }
    
}

public class A_1 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        t2.add_time(t1 , t2);
    }
}
