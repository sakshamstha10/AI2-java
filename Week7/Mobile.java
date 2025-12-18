package Week7;
import java.util.Scanner;

public class Mobile
{
    String brand;
    int price;

    String isAffordable()
    {

        if (price < 20000) 
        {
            return "Affordable";
        } else 
        {
            return "Not Affordable";
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Mobile[] mobiles = new Mobile[3];

        System.out.println("Enter details of " + 3 + " mobiles:");
        for (int i = 0; i < 3; i++) {
            mobiles[i] = new Mobile(); 
            System.out.println("\nMobile " + (i + 1) + ":");
            System.out.print("Brand: ");
            mobiles[i].brand = sc.nextLine();
            System.out.print("Price: ");
            mobiles[i].price = sc.nextInt();
            sc.nextLine();
        }

            System.out.println("\n===Mobile Details & Affordability===");
            for (int j = 0; j < 3; j++) 
            {
                Mobile m = mobiles[j];
                System.out.println("Mobile " + (j + 1) + ":");
                System.out.println("Brand : " + m.brand);
                System.out.println("Price : " + m.price);
              
                System.out.println("Status: " + m.isAffordable()); 
                System.out.println();

            }
    
    }
}