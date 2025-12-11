package Week6;
import java.util.Scanner;

public class Values
{
    public static void main(String[] args)
    {
        int[] values = {10, 20, 30, 40, 50};

        // printing the values using loop
        System.out.println("Student's Score in 5 subjects:");
        for(int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }

        // Sum of values
        System.out.println("Sum:");
        int sum = 0;
        for (int j = 0; j < values.length; j++)
        {
            sum += values[j];
        }

        System.out.println(sum);

        // Average of values
        double average = (double) sum / values.length;
        System.out.println("Average:");
        System.out.println(average);

        // highest  and lowest values
        int highest = values[0];
        int lowest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > highest) {
                highest = values[i];
            }
            if (values[i] < lowest) {
                lowest = values[i];
            }
        }

        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);

        // taking user input and printing updated value 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }

        System.out.println("Updated Scores:");
        for (int i = 0; i < n; i++) {
            System.out.println(values[i]);
        }

    }
}
