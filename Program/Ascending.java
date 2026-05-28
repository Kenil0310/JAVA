import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
    

        for(int i = 0 ; i < num ; i++)
        {
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < num - 1 ; i++)
        {
            for( int j = i + 1 ; j < num ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < num ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        
    }
}
