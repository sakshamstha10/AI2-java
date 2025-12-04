package Week5;



public class fibonacci
{
    public static void number(String[] args)
    {
        int n1=0, n2=1, n3;
        System.out.println("Fibonacci Series up to 10 terms:");
        System.out.println(n1+" "+n2+" ");
        
        for (int i = 3; i<=10; i++)
        {
            n3 = n1+n2;
            System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}