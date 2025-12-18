package Week7;
import java.util.Scanner;


public class employee
{
    int id;
    String name;
    int salary;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        employee [] emp = new employee[3];

        for(int i = 0; i<3; i++)
        {
            emp[i]=new employee();
            System.out.println("Enter id of"+" "+(i+1)+" "+"employee");
            emp[i].id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of"+" "+(i+1)+" "+"employee");
            emp[i].name=sc.nextLine();
            System.out.println("Enter salary of"+" "+(i+1)+" "+"employee");
            emp[i].salary=sc.nextInt();

        }
        for(int j=0; j<3; j++)
        {
            System.out.println("Details of"+(j+1)+" "+"employee");
            System.out.println("Id:"+ emp[j].id);
            System.out.println("Name:"+ emp[j].name);
            System.out.println("Salary:"+ emp[j].salary);

        }

        int maxIndex = 0; 
        for (int a = 1; a < 3; a++) {
            if (emp[a].salary > emp[maxIndex].salary) {
                maxIndex = a;
            }
        }

        
        System.out.println("\n=== Employee with Highest Salary ===");
        System.out.println("Id     : " + emp[maxIndex].id);
        System.out.println("Name   : " + emp[maxIndex].name);
        System.out.println("Salary : " + emp[maxIndex].salary);

}
}