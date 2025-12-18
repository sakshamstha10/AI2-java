package Week7;



public class Car
{
    int modelNumber; // instance variable or atttribute
    String brand;
    double price;
    
    void start()// behaviour or method 
    {
        System.out.println("Car start");
        
    }
    
    void stop()
    {
        System.out.println("Car stop");
        
    }
    
    public static void main(String[] args)
    {
        Car c1;
        c1 = new Car();
        
        c1.modelNumber=123;
        c1.brand="Mercedez";
        c1.price=3000;
        
        
        System.out.println("Model Number is"+" "+c1.modelNumber);
        System.out.println("Brand is"+" "+c1.brand);
        System.out.println("Price is"+" "+c1.price);
        
        c1.start();// calling method // behaviour will change 
        c1.stop();
        
        Car c2= new Car();
        
        c2.modelNumber=456;
        c2.brand="BMW";
        c2.price=3999;
        
        System.out.println("Model Number is"+" "+c2.modelNumber);
        System.out.println("Brand is"+" "+c2.brand);
        System.out.println("Price is"+" "+c2.price);
        
        c2.start();// calling method // behaviour will change 
        c2.stop();
        
        Car c3= new Car();
        
        c3.modelNumber=789;
        c3.brand="Hyundai";
        c3.price=4999;
        
        System.out.println("Model Number is"+" "+c3.modelNumber);
        System.out.println("Brand is"+" "+c3.brand);
        System.out.println("Price is"+" "+c3.price);
        
        c2.start();// calling method // behaviour will change 
        c2.stop();
    }
}