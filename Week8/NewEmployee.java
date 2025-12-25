package Week8;

public class NewEmployee
{

    private double basicSalary;

    public NewEmployee(double basicSalary)
    {

        this.basicSalary=basicSalary;
    }

    public double calculateGrossSalary() {
        double bonus = basicSalary * 0.20;
        return basicSalary + bonus;
    }

    public double getbasicSalary()
    {
        return basicSalary;
    }
}