package Week9;


/**
 * Write a description of class Run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Run
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.color = "Red";
        car1.numberOfWheels = 4;
        car1.fly();
        car1.move();
        
        Bike bike1 = new Bike();
        bike1.wheelie();
         
    }
}