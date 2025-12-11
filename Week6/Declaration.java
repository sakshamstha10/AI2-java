package Week6;
import java.util.Scanner;



public class Declaration
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age[]=new int [5];
        int matrix[][]= new int [2][2];
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter the data");
                matrix[i][j]=sc.nextInt();
            }
        }
        
        for(int k=0;k<2;k++)
        {
            for(int l=0;l<2;l++)
            {
                System.out.print(matrix[k][l]+"\t");
            }
            System.out.println();
        
    }
}
}