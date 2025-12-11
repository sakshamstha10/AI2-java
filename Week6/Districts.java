package Week6;
import java.util.Scanner;



public class Districts
{
    public static void main(String[] args)
    {
        // initial names of district 
        String[] name= {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        for (int i = 0; i<4; i++)
        {
            System.out.println((i+1)+"."+name[i]);
        }
        // user input for new data
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] updated = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter district name " + (i + 1) + ": ");
            updated[i] = sc.nextLine();
        }

        // Print updated array
        System.out.println("\nUpdated District List:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + updated[i]);
        }
    }
}