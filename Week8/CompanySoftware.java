package Week8;


/**
 * Write a description of class CompanySoftware here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompanySoftware
{
    public static void main(String[] arg)
    {
        Employee ee = new Employee(100,"ramm",1000.75);
        ee.display();
        double finalSalary=ee.getSalary();
        System.out.println("final salary:"+" "+finalSalary);
        
        ee.setName("Ramm");
        ee.display();
        
        int x=ee.getId();
        System.out.println(x);
    }
}