package Week5;
import java.util.Scanner;

public class RestaurantSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        int totalBill = 0;

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1: Burger  Rs 200");
            System.out.println("2: Momo    Rs 100");
            System.out.println("3: Pizza   Rs 300");
            System.out.println("0: Bill");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice)
            {
                case 1 -> {
                    System.out.println("You have chosen Burger");
                    System.out.print("Enter the quantity: ");
                    quantity = sc.nextInt();
                    totalBill += 200 * quantity;
                }

                case 2 -> {
                    System.out.println("You have chosen Momo");
                    System.out.print("Enter the quantity: ");
                    quantity = sc.nextInt();
                    totalBill += 100 * quantity;
                }

                case 3 -> {
                    System.out.println("You have chosen Pizza");
                    System.out.print("Enter the quantity: ");
                    quantity = sc.nextInt();
                    totalBill += 300 * quantity;
                }

                case 0 -> {
                    System.out.println("\n------ Final Bill ------");
                    System.out.println("Total Amount = Rs " + totalBill);
                    System.out.println("Thank you for ordering!");
                }

                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);
    }
}
