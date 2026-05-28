

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the Number : ");
        num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0 ; i < num ; i++)
        {
            System.out.print("Enter the array Element : ");
            arr[i] = sc.nextInt();
        }

        Permutation p1 = new Permutation();
        p1.permtation(arr);
    
    }

    void permtation(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("[" + arr[arr[i]] + "]");
        }
       
    }
}
