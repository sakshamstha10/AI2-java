package Week3;
import java.util.Scanner;


/**
 * Write a description of class DateConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DateConversion
{
   public static void main(String[]arg)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Days:");
       int TD = sc.nextInt();
       int Years = TD/365;
       int RD = TD%365;
       
       int Months = RD/30;
       int Days = RD%30;
       
       System.out.println("Year: " + Years);
       System.out.println("Months: " + Months);
       System.out.println("Days: " + Days);
       
       
   }
   
}