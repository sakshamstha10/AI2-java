package Week8;



public class Employee
{
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public void display()
    {
        System.out.println("id is"+" "+this.id);
        System.out.println("name is"+" "+this.name);
        System.out.println("salary is"+" "+this.salary);
    }
    
    public double getSalary()
    {
      double annualSalary=this.salary*12;
      return annualSalary;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public int getId()
    {
        return this.id;
    }
}