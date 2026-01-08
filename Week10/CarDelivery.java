package Week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
  private double bonus;
    
    
    public CarDelivery (int partnerId, String name, double basePay, double bonus)
    {
        super(partnerId, name, basePay);
        this.bonus = bonus;
    }
    
    @Override
    public double calcSalary()
    {
        return super.calcSalary() + bonus;
        
    }
    
    @Override
   public String toString()
   {
       return super.toString()+" "+"bonus is"+" "+this.bonus+" ";
}  
}
