package Week10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main (String[] args)
    {
        Doctor d = new Doctor(101, "Ram", 2000, "Heart", 1000);
        System.out.println(d);
        double salary = d.calculateSalary();
        System.out.println(salary);
        double salaryWithCase = d.calculateSalary(3);
        System.out.println(salaryWithCase);
        
        Nurse n = new Nurse (202, "Atharva", 1500, "Night", 500);
        System.out.println(n);
        double nurseSalary = n.calculateSalary();
        System.out.println(nurseSalary);
        

    }
}