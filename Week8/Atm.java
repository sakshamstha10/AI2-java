package Week8;



public class Atm
{
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount (12345,15000,"Saksham Shrestha");
        
        acc.deposit(2000);
        
        acc.withdraw(1500);
        
        System.out.println("Current balance:"+" "+acc.getBalance());
        
    }
}