package Week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    private String shift;
    private int extraAllowance;
    
    public Nurse (int id, String name, double basicSalary, String shift, int extraAllowance)
    {
        super(id, name, basicSalary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    
    }
    
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary()+this.extraAllowance;
    }
    
    @Override
   public String toString()
   {
       return super.toString()+" "+"shift is"+" "+this.shift+" "+"extraAllowance is"+" "+this.extraAllowance+" ";
   }
}