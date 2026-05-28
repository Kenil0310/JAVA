import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int []arr = new int[num];

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the Element : ");
            arr[i] = sc.nextInt();
        }

        A_2 a2 = new A_2();
        a2.Average(arr,num);
    }
    void Average(int arr[],int num)
    {
        int sum=0;
        
        for(int i = 0 ; i < arr.length ; i++)
            {
                sum = sum + arr[i];
            }
        float avg = sum / num ;

        System.out.print("Average = " + avg);
    }
}
