package Week5;
import java.util.Scanner;



public class EvenOddCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        int evencount = 0;
        int oddcount = 0;
        
        while(num>0)
        {
            int digit = num %10;
            
            if(digit % 2 == 0)
            evencount++;
            else
            oddcount++;
            
            num = num/10;
            
                
        }
        System.out.println("Even digits: " + evencount);
        System.out.println("Odd digits: " + oddcount);
        }
    }