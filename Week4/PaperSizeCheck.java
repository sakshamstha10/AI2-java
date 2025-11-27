package Week4;
import java.util.Scanner;

public class PaperSizeCheck {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paper Size (A0 - A5):");
        String Ps = sc.next().toUpperCase(); 

        switch (Ps) {
            case "A0" ->
                System.out.println("Paper Dimensions = 841 x 1189 mm (33.1 x 46.8 inches)");
            case "A1" ->
                System.out.println("Paper Dimensions = 594 x 841 mm (23.4 x 33.1 inches)");
            case "A2" ->
                System.out.println("Paper Dimensions = 420 x 594 mm (16.5 x 23.4 inches)");
            case "A3" ->
                System.out.println("Paper Dimensions = 297 x 420 mm (11.7 x 16.5 inches)");
            case "A4" ->
                System.out.println("Paper Dimensions = 210 x 297 mm (8.3 x 11.7 inches)");
            case "A5" ->
                System.out.println("Paper Dimensions = 148 x 210 mm (5.8 x 8.3 inches)");
            default ->
                System.out.println("Invalid paper size!!");
        }
    }
}
