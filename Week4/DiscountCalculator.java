package Week4;
import java.util.Scanner;



public class DiscountCalculator
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marked Price:");
        float mp = sc.nextFloat();
        
        System.out.println("Enter the category of discount");
        char cat = sc.next().toUpperCase().charAt(0);
        
        float discountPercent = 0;
        
        switch(cat)
        {
            case 'A':
                discountPercent = 60;
                break;
            case 'B':
                discountPercent = 40;
                break;
            case 'C':
                discountPercent = 20;
                break;
            case 'D':
                discountPercent = 10;
                break;
            default:
                System.out.println("Invalid Category");
                return;
            
        }
        float sp = mp - (mp* discountPercent /100 );
        System.out.println("Selling Price = " +sp);
        
        
    }
}