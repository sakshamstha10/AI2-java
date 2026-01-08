package Week10;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employee
{
    private double da;
    
    public PermanentEmployee(int empId, String name, double basicSalary)
    {
        super(empId, name, basicSalary); // calling the parent class constructor from child class constructor
        this.da=basicSalary*0.2;
        
    }
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary()+da;
    }
}