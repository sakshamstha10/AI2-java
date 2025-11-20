import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int first_number = sc.nextInt();
        
        System.out.println("Enter Second Number:");
        int second_number = sc.nextInt();
        
        if(first_number>second_number){
            System.out.println("The greater number is:"+ first_number);
        }
        else if(second_number>first_number){
            System.out.println("The greater number is:"+ second_number);
        }
        else{
            System.out.println("Both number are equal");
        }
         
        int add = first_number + second_number;
        int sub = first_number - second_number;
        int product = first_number * second_number;
        float division = (float)first_number / second_number;
        
        System.out.println("Addition:"+ add);
        System.out.println("Subtraction:"+ sub);
        System.out.println("Multiplication:"+ product);
        System.out.println("Divide:"+ division);
        
    }
}