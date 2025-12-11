package Week6;





public class SeatingChart {
    public static void main(String[] args) {
        
        String[][] seats = new String[2][3];
        
        
        seats[0][0] = "Alice";
        seats[0][1] = "Bob";
        seats[0][2] = "Charlie";
        
        
        System.out.println("Seating Chart:");
        System.out.println("------------------");
        System.out.println("Row\tSeat 1\t\tSeat 2\t\tSeat 3");
        System.out.println("------------------");
        
        for (int row = 0; row < seats.length; row++) {
            System.out.print("R" + (row + 1) + "\t");
            
            for (int seat = 0; seat < seats[row].length; seat++) {
                if (seats[row][seat] == null || seats[row][seat].isEmpty()) {
                    System.out.print("[empty]\t\t");
                } else {
                    System.out.print(seats[row][seat] + "\t\t");
                }
            }
            System.out.println();
        }
        
        System.out.println("------------------");
    }
}