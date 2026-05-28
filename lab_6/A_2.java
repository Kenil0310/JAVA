

import java.util.Scanner;

class Cube
{
    Double height;
    Double width;
    Double depth;
                                                                    
    void setter()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height : ");
        height = sc.nextDouble();

        System.out.print("Enter the width : ");
        width = sc.nextDouble();

        System.out.print("Enter the depth : ");
        depth = sc.nextDouble();
    }
    void getter()
    {
        System.out.println("----Cube Details----");
        System.out.println("Height :" +height);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
        System.out.println("Volume of cube is : " + volume());
    }
    double volume()
    {
        return height * width * depth;
    }
}

public class A_2 {
    public static void main(String[] args) {
        Cube[] c = new Cube[2];
        
        for(int i = 0 ; i < c.length ; i++)
        {
            c[i] = new Cube();
            c[i].setter();
        }
         for(int i = 0 ; i < c.length ; i++)
        {
            c[i].getter();
            
        }
    }
}
