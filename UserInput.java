import java.util.Scanner;

/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[]arg)
    {
     /*
     * we use scanner to take input from user 
     * it is built in class type in java
     */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber=sc.nextInt();
        
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
        System.out.println("GreatestNumber is"+bigger);
    }
}