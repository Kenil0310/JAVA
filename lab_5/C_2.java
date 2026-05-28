import java.util.Scanner;

public class C_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the number of element: ");
            arr[i] = sc.nextInt();
        }

        C_2 answer = new C_2();
        answer.search(arr);
    }
    void search(int arr[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        
        int temp ;
        System.out.print("Enter the number to find in an array: ");
        int number = sc.nextInt();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(number == arr[i])
            {
                System.out.println("Index is: " + i);
            }
        }
        for(int i = 0 ; i < index ; i++)
        {
            for(int j = 0 ; j < arr.length - 1 ; j++)
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}