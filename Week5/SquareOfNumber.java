package Week5;



public class SquareOfNumber
{
    public static void main(String[] args)
    {
        int sum = 0;
        
        for(int i = 1; i<=10; i++)
        {
            sum += i*i;
        }
        System.out.println("The sum of square of 10 natural number is"+" "+sum);
    }
}
