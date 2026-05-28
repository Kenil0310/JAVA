import java.util.Scanner;

public class A_3 {
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

        A_3 a3 = new A_3();
        a3.Reverse(arr);
    }

    void Reverse(int arr[])
    {
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
