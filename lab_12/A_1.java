
    public class A_1 {
    public static void main(String[] args) {
        try
        {
            int a = 10;
            int b = 0;
            int ans = a / b;
            System.out.println(ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }

        try
        {
            int[] arr = new int[3];
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
    }
}

