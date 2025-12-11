package Week6;
import java.util.Scanner;



public class StaticArray
{
    public static void main(String[] args)
    {
        String[] students = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};

        // Printing name using for loop
        System.out.println("Original Array:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //Printing the name at index 2 
        System.out.println("\nName at index 2: " + students[2]);

        //Changing the name at index 4 and printing the updated value
        students[4] = "UpdatedSandesh";
        System.out.println("Updated name at index 4: " + students[4]);

        //Use Scanner to read a new name and update the array
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a new name to update index 1: ");
        String newName = sc.nextLine();
        students[1] = newName;

        //Printing the updated array
        System.out.println("\nUpdated Array:");
        for (int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i]);
        }
    }
}