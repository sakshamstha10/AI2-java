package Week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main (String [] args)
    {
        BikeDelivery b = new BikeDelivery(1, "Darshan", 10000, 1000);
        System.out.println(b);
        System.out.println("Final salary is:"+b.calcSalary());
        
        CarDelivery c = new CarDelivery(2, "Saksham", 13000, 1300);
        System.out.println(c);
        System.out.println("Final salary is:"+c.calcSalary());
    }
}