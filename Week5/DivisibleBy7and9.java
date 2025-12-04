package Week5;



public class DivisibleBy7and9
{
    public static void main(String[] args)
    {

        for(int i = 1; i <= 100; i++)
        {
            if(i % 7 == 0 && i % 9 == 0) 
            {
                System.out.println("First number divisible by both 7 and 9 is: " + i);
                break; 
            }
        }
    }
}