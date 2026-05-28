import java.util.Scanner;

class Array {

    void sort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Sorting of Array element----");
        System.out.print("Enter the size of Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of Array : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("---Sorting of array---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Search of Array element----");
        System.out.print("Enter the size of Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of Array : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index : ");
        int index = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i == index) 
            {
                System.out.print("Element of Array : " + arr[i]);
            }
        }
    }

    void Sum() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----Sum of Array element----");
        System.out.print("Enter the size of Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of Array : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print("Sum of Element : " + sum);
    }

    void Avg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Average of Array element----");
        System.out.print("Enter the size of Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of Array : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum = sum + arr[i];
        }
        double avrage = sum / num ;

        System.out.print("Avg = " + avrage);
        
    }
}

public class B_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Array a1 = new Array();
        a1.sort();
        a1.search();
        a1.Sum();
        a1.Avg();
    }
}
