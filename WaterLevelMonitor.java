import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void maain(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Water Level=");
        int water_level = sc.nextInt();
        System.out.println("Your water level is="+ water_level);
        int Remaining_water = 1000 - water_level;
         if (water_level<1000)
         {
             System.out.println("Water Level is normal");
            }else{
                System.out.println("WARNING, Water Level has reached 1000 or more");
            }
            }
            
            
         }
        
        
        
    
