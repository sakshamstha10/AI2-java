package Week3;
import java.util.Scanner;


/**
 * Write a description of class TimeConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeConversion
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in second:");
        int TS = sc.nextInt();
        int hours = TS/3600;
        int RT= TS%3600;
        
        int Mins = RT/60;
        int sec = RT%60;
        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + Mins);
        System.out.println("Seconds: " + sec);
        
    }
}