package Week3;
import java.util.Scanner;


/**
 * Write a description of class Trial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Trial {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7:");
        int dayNumber = sc.nextInt();  
        
        String dayName = switch (dayNumber) {  
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day"; 
        };

        System.out.println("The day is: " + dayName);
    }
}
