package Week10;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    protected int empId;
    protected String name;
    protected double basicSalary;
    
    public Employee(int empId, String name, double basicSalary)
    {
        this.empId= empId;
        this.name= name;
        this.basicSalary= basicSalary;
    }
    
    public double calculateSalary()
    {
        return this.basicSalary;
    }
    
    public void display()
    {
        System.out.println("Id is"+" "+this.getEmpId());
        System.out.println("Name is" + "  "+this.getName());
        System.out.println("Basic Salary is" + "  "+this.getBasicSalary());
    }
    
    public int getEmpId()
    {
        return this.empId;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
    
    public double calculateSalary(int extraTime)
    {
        return this.basicSalary+extraTime*500;
    }
}