package Week4;
import java.util.Scanner;



public class EvenOddExample
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        
        if(number%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
        
    }
}