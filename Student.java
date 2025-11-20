import java.util.Scanner;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String Student_name = sc.nextLine();
        
        System.out.println("Enter Student age:");
        int Student_age = sc.nextInt();
        
        System.out.println("Enter Student GPA:");
        float Student_gpa = sc.nextFloat();
        
    }
}