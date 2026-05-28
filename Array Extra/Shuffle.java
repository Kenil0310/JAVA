import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Number consider of 2n Element : ");
        int n = sc.nextInt();

        int multi = 2 * n;

        int[] arr1 = new int[multi];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Entet the Element : ");
            arr1[i] = sc.nextInt();
        }
        int k = arr1.length / 2;
        int len = arr1.length;
        int arr2[] = new int[len];

        for (int i = 0; i < k; i++) {

            arr2[i * 2] = arr1[i];
            arr2[i * 2 + 1] = arr1[i + k];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr2[i]);
        }

    }
}