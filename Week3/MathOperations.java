package Week3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numeric grade: ");
        int grade = scanner.nextInt();
        
        String result = (grade >= 40) ? "pass" : "fail";
        
        System.out.println("Result:\t" + result);
    }
}