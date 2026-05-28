class Counts
{
    static int count=0;

    Counts()
    {
        count++;
    }                                                   
}
public class A_2 {
    public static void main(String[] args) {
        Counts c1 = new Counts();
        Counts c2 = new Counts();
        Counts c3 = new Counts();
        Counts c4 = new Counts();
        Counts c5 = new Counts();

        System.out.println("number of object in this code : " + Counts.count);
    }
}
    