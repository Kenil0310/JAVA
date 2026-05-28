import java.util.Scanner;

public class B_1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("enter the Array number : ");
      int num = sc.nextInt();

      int []arr = new int[num];

      for(int i = 0 ; i < arr.length ; i++)
      {
        System.out.print("Enter the element :");
        arr[i] = sc.nextInt();
      }

      B_1 b1 = new B_1();
      b1.Copy(arr);

    }
    void Copy(int arr[])
    {
        int len = arr.length;
        int arr1[] = new int[len];

        for(int i = 0 ; i < arr1.length ; i++)
        {
            arr1[i] = arr[i];
        }
        System.out.println("Original Array");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println("\nCopy Array");
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print(" " + arr1[i]);
        }

    }
}
