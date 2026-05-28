interface Playable
{
    void play();
}
class football implements Playable
{
    public void play()
    {
        System.out.println("Play football");
    }
}
class basketball implements Playable
{
    public void play()
    {
        System.out.println("Play basketball");
    }
}
class volleyball implements Playable
{
    public void play()
    {
        System.out.println("Play volleyball");
    }
}
public class C_5 {
    public static void main(String[] args) {
        football f1 = new football();
        f1.play();
        basketball b1 = new basketball();
        b1.play();
        volleyball v1 = new volleyball();
        v1.play();
    }
}
