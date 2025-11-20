import java.util.Scanner;
import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("💖 Welcome to the Love Calculator 💖");
        System.out.print("Enter your name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter your partner's name: ");
        String name2 = sc.nextLine();

        // Generate a random love percentage between 50 and 100
        int lovePercentage = 50 + rand.nextInt(51);

        // Display the result
        System.out.println("\n❤️ " + name1 + " + " + name2 + " ❤️");
        System.out.println("Your love compatibility is: " + lovePercentage + "%");

        // Add a fun message
        if (lovePercentage > 90) {
            System.out.println("Perfect match! 💞 Made for each other!");
        } else if (lovePercentage > 70) {
            System.out.println("Great match! Keep the spark alive! 🔥");
        } else if (lovePercentage > 50) {
            System.out.println("Good connection, needs some effort ❤️‍🔥");
        } else {
            System.out.println("Hmm... maybe just friends 😅");
        }

        sc.close();
    }
}
