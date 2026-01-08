package Week10;


/**
 * Write a description of class PartTimeEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeEmployee extends Employee
{
    private int bonus;
    
    public PartTimeEmployee(int empId, String name, double basicSalary, int bonus)
    {
        super(empId, name, basicSalary);
        this.bonus=bonus;
        
        
    }
}