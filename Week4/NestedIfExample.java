package Week4;
import java.util.Scanner;



public class NestedIfExample
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num%3==0)
        {
            if(num%5==0)
            {
                System.out.println("Divisible by both 3 and 5");
            }
            else{
               System.out.println("Only divisible by 3 not by 5"); 
            }
           
        }
        else
        {
           if(num%5==0)
           {
               System.out.println("Divisible by 5 not by 3");
           }
           else
           {
               System.out.println("Not divisible by both 3 and 5");
           }
        }
        }
       
            
        }