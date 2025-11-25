package Week4;
import java.util.Scanner;



public class ResultSystem
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage:");
        int percentage = sc.nextInt();
        
        if((percentage>=95) && (percentage <=100)){
            System.out.println("Congratulation! You got Distinction");
        }
        else if((percentage>= 80) && (percentage <=94)){
            System.out.println("Very good! You got First Division");
        }
        else if((percentage>= 70) && (percentage <=79)){
            System.out.println("Good! You got Second Division");
        }
        else if((percentage>=60) && (percentage<=69)){
            System.out.println("Satisfactory! You got Third Division");
        }
        else if(percentage<50){
            System.out.println("Work hard! You failed this time");
        }
        else{
            System.out.println("Input Error");
        }
        
    }
    
}