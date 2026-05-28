import java.util.Scanner;

class Extra
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("number");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println("Array : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.println(" " + arr[num - 1 - i]);
        }

    }
}