package Week6;


public class MarksIn2DArray
{
    public static void mian (String[] args)
    {
        int[][] marks = {{80, 75},  {90, 85}};
        System.out.println("Student Marks Table:");
        System.out.println("Student\tNepali\tEnglish");

        for (int student = 0; student < 2; student++)
        {
            System.out.print("S" + (student + 1) + "\t");
            System.out.print(marks[student][0] + "\t");
            System.out.print(marks[student][1] + "\t");
            System.out.println();
        }

        for (int student = 0; student < 2; student++) {
            int total = 0;
            for (int subject = 0; subject < 2; subject++) {
                total += marks[student][subject];
            }
            System.out.println("Student " + (student + 1) + " total marks: " + total);
    }
}
}