package Week5;



public class SumOfEvenandOdd
{
    public static void main(String[] args)
    {
        int sum1= 0;
        int sum2= 0;
        
        for(int i =1; i<=10; i++)
        {
            if(i%2==0)
            {
                sum2 += i;               
            }
            else
            {
                sum1 += i;              
            }
        }
        System.out.println("Sum of even number is:"+" "+sum2);
        System.out.println("Sum of odd number is:"+" "+sum1);
    }
}