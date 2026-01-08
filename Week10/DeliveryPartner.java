package Week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int id, String name, double basePay)
    {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;        
    }
    
    public int getId()
    {
        return this.partnerId;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public double getbasePay()
    {
        return this.basePay;
    }
    
    public int setId()
    {
        return this.partnerId = partnerId;
    }
    
    public String setname()
    {
        return this.name = name;
    }
    
    public double setbasePay()
    {
        return this.basePay = basePay;
    }
    
    @Override
   public String toString()
   {
       return "id is"+" "+this.partnerId+" "+ "name is"+" "+this.name+" "+"basePay is"+" "+this.basePay+" ";
   }
    
   public double calcSalary()
   {
       return this.basePay;
   }
}