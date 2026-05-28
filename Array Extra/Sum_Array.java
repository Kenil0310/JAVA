import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                sum = sum + arr[j];
            }
            System.out.print("[" + sum + "]");

        }
    }
}
