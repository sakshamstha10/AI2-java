package Week4;
import java.util.Scanner;



public class ScholorshipEligibity
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA:");
        float gpa = sc.nextFloat();
        
        System.out.println("Enter your Attendance:");
        int att = sc.nextInt();
        
        System.out.println("Enter your Attitude Score:");
        int as = sc.nextInt();
        
        if (gpa >= 3.2) 
        {
            if (att > 80)
            {
                if (as < 5) 
                {
                    System.out.println("You are eligible for a scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score must be less than 5.");
                }
            } 
            else 
            {
                System.out.println("Not eligible: Attendance must be above 80%.");
            }
        } 
        else
        {
            System.out.println("Not eligible: GPA must be 3.2 or higher.");
        }
    }
}
    
    
