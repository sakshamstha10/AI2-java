package Week6;



public class Array
{
    public static void main(String[] args)
    {
        int [] age; //array declaration
        age = new int[5]; // construction of array 
        
        age[0]=10; // initialization of array 
        age[1]=20;
        age[2]=40;
        age[3]=50;
        age[4]=22; 
        
        
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        
        
        int[]number= new int[5];
        System.out.println("Using loop to initialize the array");
        int x=2;
        for(int i=0;i<number.length;i++)
        {
            number[i]=x;
            x=x+2;
        }
        System.out.println("Display using loop");
        for(int j=0;j<number.length;j++)
        {
            System.out.println(number[j]);
        }
    }
}