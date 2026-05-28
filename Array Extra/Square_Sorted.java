import java.util.Scanner;

public class Square_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int []arr = new int[num];
        int power = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the Element : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            for(int j = i + 1 ; j < arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {    
            arr[i] = arr[i] * arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
