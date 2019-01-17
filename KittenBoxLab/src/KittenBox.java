package useridlab10;

import java.util.ArrayList;

public class KittenBox {
    
    public String learner = "lastname, firstname";
    ArrayList<Kitten> kitten;
    BoxGUI box;
    private int numRows = 8;
    private int numCols = 8;
    private int startRow = 1;
    private int startCol = 1;
    private int exit = 54;
    private int numKittens = 200;

    public KittenBox() {  // KittenBox constructor

        /**
         * Initialize the kitten ArrayList
         * Use a loop to add Kitten objects to the kitten ArrayList
         */
        
        box = new BoxGUI(numRows, numCols, (startRow * numCols + startCol), exit, numKittens);
        play();
    }

    private void play() {

        int square, numMoves = 0;
        while (kitten.size() > 0)  // keep looping until all kitten have escaped
        {
            int[] table = new int[numRows * numCols]; //needed for GUI

            // Inner loop that loops once through your ArrayList getting each 
            // Kitten object's new location (square).
            {

                /**
                 * Your code should loop through your kitten ArrayList and  
                 * call kitten.move(). move() should return a int representing
                 * the kitten's new location or square.
                 * 
                 * Increment the table array by 1 where the index matches the 
                 * kittens move (or square). For example, if a kitten moves to 
                 * square 5 then increment table[5]++ 
                 * 
                 * When the kitten moves to the exit square then remove the kitten
                 * from the ArrayList.
                 */
                
                
            }
            box.updateGUI(table);
            numMoves++;
            System.out.println(kitten.size() + " kittens remaining after " + numMoves + " moves.");
        }
        box.updateGUI(new int[numRows * numCols]);
        System.out.println("All kittens have escaped.");

    }
}
