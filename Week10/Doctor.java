package Week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
   private String specialization;
   private int consultationFee;
   
   public Doctor (int id, String name, double basicSalary, String specialization, int consultationFee )
   {
       super(id, name, basicSalary);
       this.specialization = specialization;
       this.consultationFee = consultationFee;
   }
   
   @Override
   public double calculateSalary()
   {
       return super.calculateSalary()+this.consultationFee;
   }
   
   public double calculateSalary(int emergencyCases)
   {
       return this.calculateSalary()+(emergencyCases*1000);
   }
   
   @Override
   public String toString()
   {
       return super.toString()+" "+"specialization is"+" "+this.specialization+" "+"consultationFee is"+" "+this.consultationFee+" ";
   }
}