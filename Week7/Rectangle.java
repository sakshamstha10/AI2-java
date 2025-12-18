package Week7;
import java.util.Scanner;


public class Rectangle
{
    float length;
    float breadth;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Enter the length:");
        r1.length = sc.nextFloat();
        System.out.println("Enter the breadth:");
        r1.breadth = sc.nextFloat();

        Rectangle r2 = new Rectangle();
        System.out.println("Enter the length:");
        r2.length = sc.nextFloat();
        System.out.println("Enter the breadth:");
        r2.breadth = sc.nextFloat();

        r1.calc();
        r2.calc();

    }

    void calc()
    {
        System.out.println("Length is:"+" "+length);
        System.out.println("breadth is:"+" "+breadth);
        System.out.println("Area is:"+" "+length*breadth);
        System.out.println();

    }
}