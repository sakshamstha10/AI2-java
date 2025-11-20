package Week3;


/**
 * Write a description of class DatatypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatatypeExample
{
    public static void main(String[]arg)
    {
        int length=10;
        int breadth=20;
        
        int area= length+breadth;
        int perimeter= 2*(length+breadth);
        System.out.println("area:"+area+"\t"+"perimeter:"+perimeter);
        
        int principle=500;
        int time=2;
        float rate=2.4f;
        
        float si= (float)(principle+time+rate/100);
        System.out.println("Simple Interest:"+si);
        double Amount = principle * Math.pow((1 + rate / 100), time);
        double CI = Amount - principle;
        System.out.println("Compound Interest is: " + CI);
        System.out.println("Amount is: " + Amount);
                        
    }
}