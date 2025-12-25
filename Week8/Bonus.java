package Week8;


public class Bonus
{
    public static void main(String[] args)
    {
        NewEmployee e1 = new NewEmployee(30000);
        double gross1 = e1.calculateGrossSalary();
        System.out.println("Basic salary of employee"+" "+e1.getbasicSalary()+"\n");
        System.out.println("Gross salary of employee"+" "+gross1+"\n");
        System.out.println();
        
        

    }
}