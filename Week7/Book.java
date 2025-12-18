package Week7;
import java.util.Scanner;

public class Book
{

    String title;
    String author;
    int price;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book Book1 = new Book();
        System.out.println("Enter the details of first book");
        System.out.println("Enter the author name:");
        Book1.author= sc.nextLine();

        System.out.println("Enter the title:");
        Book1.title= sc.nextLine();
        System.out.println("Enter the price:");
        Book1.price= sc.nextInt();

        sc.nextLine();
        Book Book2 = new Book();
        System.out.println("Enter the details of second book");
        System.out.println("Enter the author name:");
        Book2.author= sc.nextLine();

        System.out.println("Enter the title:");
        Book2.title= sc.nextLine();
        System.out.println("Enter the price:");
        Book2.price= sc.nextInt();

        System.out.println("The details of the books are:");
        System.out.println("Book 1");
        System.out.println("The author of the book is"+" "+Book1.author);
        System.out.println("The title of the book is"+" "+Book1.title);
        System.out.println("The author of the book is"+" "+Book1.price);

        System.out.println("Book 2");
        System.out.println("The author of the book is"+" "+Book2.author);
        System.out.println("The title of the book is"+" "+Book1.title);
        System.out.println("The price of the book is"+" "+Book1.price);

    }
}