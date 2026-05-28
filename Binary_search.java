import java.util.Scanner;

public class Binary_search
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the element : " + i);
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.print("Enter the search the element : ");
        int search_num = sc.nextInt();

        int low = 0;
        int mid ;
        int high = arr.length - 1;
        boolean isFound = false;

        
        while (low <= high) {
            mid = (high + low) / 2;
            
            if (search_num < arr[mid]) {
                high = mid - 1;
            }
            else if (search_num > arr[mid]) {
                low = mid + 1;
            }
            else
            {
                isFound = true;
                System.out.println("Found At : " + mid);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Number does not found!");
        }

    }
}