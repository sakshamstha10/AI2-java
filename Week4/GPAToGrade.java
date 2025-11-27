package Week4;
import java.util.Scanner;



public class GPAToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = sc.nextDouble();

        
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA!");
            return;
        }

        String grade;

        
        if (gpa >= 3.6) {
            grade = "A+";
        } else if (gpa >= 3.0) {
            grade = "A";
        } else if (gpa >= 2.0) {
            grade = "B+";
        } else if (gpa >= 1.0) {
            grade = "B";
        } else {
            grade = "F";
        }

       
        System.out.println("Your Grade: " + grade);
    }
}

