package Week4;
import java.util.Scanner;



public class DivisibleOrNot
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        
        if (number%3==0 && number%5==0)
        {
            System.out.println("It is divisible by 3 and 5 both");
        }
        else if (number%3==0 && number%5 !=0)
        {
            System.out.println("It is divisible by 3 and not by 5");
        }
        else if (number%5==0 && number%3 !=0)
        {
            System.out.println("It is divisible by 5 and not by 3");
        }
        else 
        {
            System.out.println("It is not divisible by both 3 and 5");
        }
    }
}