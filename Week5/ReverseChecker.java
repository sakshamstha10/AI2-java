package Week5;
import java.util.Scanner;



public class ReverseChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        
        int orginalNum = num;
        int reverseNum = 0;
        
        while (num != 0)
        {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Numner:"+" "+ reverseNum);
        if(orginalNum == reverseNum)
        {
            System.out.println("The number is Palindrome.");
        }
        else
        {
            System.out.println("The number is not palindrome.");
        }
    }
}