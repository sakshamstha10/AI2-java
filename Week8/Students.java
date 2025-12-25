package Week8;


public class Students
{
    private int id;
    private String name;
    private String address;
    private long phoneNumber;

    private static String collegeName="ABC College";

    public Students(int id, String name, String address, long phoneNumber) 
    {
        this.id = id;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    
    public void display()
    {
        System.out.println("====Student detail====");
        System.out.println("Id is:"+" "+this.id);
        System.out.println("Name is:"+" "+this.name);
        System.out.println("Name is:"+" "+this.address);
        System.out.println("Name is:"+" "+this.phoneNumber);
    }
}
