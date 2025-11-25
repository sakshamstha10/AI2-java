package Week3;
import java.util.Scanner;


/**
 * Write a description of class Marks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Marks
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3, s4, s5;

        System.out.print("Enter marks of Maths: ");
        s1 = sc.nextInt();
        
        System.out.println("Enter marks of Science:");
        s2 = sc.nextInt();
        
        System.out.print("Enter marks of English: ");
        s3 = sc.nextInt();
        
        System.out.print("Enter marks of Nepali: ");
        s4 = sc.nextInt();
        
        System.out.print("Enter marks of Computer: ");
        s5 = sc.nextInt();
        
        int total = s1+s2+s3+s4+s5;
        double average = total/5.0;
        double percentage = (total/500.0)*100;
        
        System.out.println("Average = " + average);
        System.out.println("Percentage = " + percentage + "%");
        
        
    }
}