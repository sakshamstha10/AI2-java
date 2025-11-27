package Week4;
import java.util.Scanner;



public class PassOrFail
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Percentage");
        int percentage = sc.nextInt();
        
        if(percentage>=40)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}