import java.util.Scanner;

public class A_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int []arr = new int[num];

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the array["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        A_1 a1 = new A_1();
        a1.sum(arr);
    }

    void sum(int arr[])
    {
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print("Sum : "+sum);
    }
}
