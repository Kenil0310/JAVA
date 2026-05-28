interface EventListener
{
    void PerformEvent();
}
interface MouseListener extends EventListener
{
    void MouseClicked();
    void MousePressed();
    void MouseReleased();
    void MouseMoved();
    void MouseDragged();
}
interface KeyListener extends EventListener
{
    void KeyPressed();
    void KeyReleased();
}
class EventDemo implements MouseListener,KeyListener
{
    public void PerformEvent()
    {
        System.out.println("Perform Event");
    }
    public void MouseClicked()
    {
        System.out.println("Mouse clicked");
    }
    public void MousePressed()
    {
        System.out.println("Mouse pressed");
    }
    public void MouseReleased()
    {
        System.out.println("Mouse released");
    }
    public void MouseMoved()
    {
        System.out.println("mouse moved");
    }
    public void MouseDragged()
    {
        System.out.println("Mouse dreagged");
    }
    public void KeyPressed()
    {
        System.out.println("Key pressed");
    }
    public void KeyReleased()
    {
        System.out.println("Key released");
    }

}
public class A_2 {
    public static void main(String[] args) {
        EventDemo e1 = new EventDemo();
        e1.PerformEvent();
        e1.MouseClicked();
        e1.MouseDragged();
        e1.MouseMoved();
        e1.MousePressed();
        e1.MouseReleased();
        e1.KeyPressed();
        e1.KeyReleased();
    }
}
