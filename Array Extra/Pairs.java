import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println("Enter the Element [" + i + "]  : "  );
            arr[i] = sc.nextInt();
        }

        Pairs p1 = new Pairs();
        p1.setter(arr);

            
    }
     void setter(int arr[])
    {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i + 1 ; j < arr.length ; j++)
            {
                if (arr[i] == arr[j]) 
                {
                     count++;  
                }
            }
        }
        System.out.println();
        System.out.println("Numer of good pairs : " + count);
    }
}
