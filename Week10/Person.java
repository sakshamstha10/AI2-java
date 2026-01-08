package Week10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
   private int id;
   private String name;
   private double basicSalary;
   
   public Person(int id, String name, double basicSalary)
   {
      this.id=id;
      this.name=name;
      this.basicSalary=basicSalary;
      
   }
   
   public int getid()
   {
       return this.id;
   }
   
   public String getname()
   {
       return this.name;
   }
   
   public double getbasicSalary()
   {
       return this.basicSalary;
   }
   
   public int setid()
   {
       return this.id=id;
   }
   
   public String setname()
   {
       return this.name = name;
   }
   
   public double setbasicSalary()
   {
       return this.basicSalary = basicSalary;
   }
   
   @Override
   public String toString()
   {
       return "id is"+" "+this.id+" "+ "name is"+" "+this.name+" "+"basicSalary is"+" "+this.basicSalary+" ";
   }
   
   public double calculateSalary()
   {
       return this.basicSalary;
   }
}
