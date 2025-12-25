package Week8;

public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name;

    public BankAccount(int accountNumber, double balance, String name)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }    

    public double getBalance() 
    {
        return balance;
    }

    public void deposit (double amount)
    {
        if(amount>0)
        {
            balance+= amount;
            System.out.println("Deposited successfully");
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    public boolean withdraw(double amount)
    {
        if(amount >0 && amount<=balance)
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            return true;
        }
        else
        {
            System.out.println("Withdrawal failed! Insufficient balance or invalid amount.");
            return false;
        }
    }
}
