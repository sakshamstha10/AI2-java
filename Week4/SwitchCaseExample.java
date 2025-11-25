package Week4;
import java.util.Scanner;



public class SwitchCaseExample
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the mathematical operator");
        char operator = sc.next().charAt(0);
        
        switch(operator)
        {
            case'+'->
            System.out.println("Addition is"+" "+(num1+num2));
            case '-'->
            System.out.println("Subtraction is"+" "+(num1-num2));
            case '*'->
            System.out.println("Multiplication is"+" "+(num1*num2));
            case '/'->
            System.out.println("Division is"+" "+(num1/num2));
            
        }
    }
}