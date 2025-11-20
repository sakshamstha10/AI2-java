package Week3;
import java.util.Scanner;


/**
 * Write a description of class Greaterorless here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Greaterorless
{
    public static void main (String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number one:");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Number two:");
        int num2 = sc.nextInt();
        
        String result = (num1>num2)? "greater" : "less";
        
        System.out.println("First Number is\t" + result + "\tthan second number");

        
        
    }
}