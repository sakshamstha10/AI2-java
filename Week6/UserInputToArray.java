package Week6;
import java.util.Scanner;



public class UserInputToArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        
        int size=sc.nextInt();
        
        String []name= new String[size];
        
        for(int i=0; i<name.length;i++)
        {
            System.out.println("Enter the name");
            name[i]=sc.next();
        }
        System.out.println("Display using loop");
        for(int j=0;j<name.length;j++)
        {
            System.out.println(name[j]+"\t");
        }
        
    }
}