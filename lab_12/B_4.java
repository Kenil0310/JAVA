public class B_4 {
    public static void main(String[] args) {
        try
        {
            String str = "java";
            int a = Integer.parseInt(str);
            String str1 = "python";
            int b = Integer.parseInt(str1);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormat Exception");
        }
        catch(ArithmeticException e)
        {   
            System.out.println("Arithmetic Exception");
        }

            
        try
        {
            String str = "11";
            int a = Integer.parseInt(str);
            String str1 = "0";
            int b = Integer.parseInt(str1);
            int ans = a / b;
            System.out.println(ans);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormat Exception");
        }
        catch(ArithmeticException e)
        {   
            System.out.println("Arithmetic Exception");
        }
    }
}