package useridlab10;

class Kitten {
    
    public String learner = "lastname, firstname";
    private int numRows, numCols;
    private int currRow, currCol;

    // Initialize your instance variables with the values passed
    public Kitten(int numRows, int numCols, int row, int col) {

        
    }

    /**
     * Implement the move method that returns the location (square) the kitten 
     * has moved to. 
     * 
     * Your kittens will move in a random direction (up, down, left, or right) 
     * by 1 square. Return the integer value of the new square. Check your 
     * boundary conditions since a kitten cannot move through walls. For 
     * example; A 4x4 box would contain the following squares. 
     *  0  1  2  3 
     *  4  5  6  7 
     *  8  9 10 11 
     * 12 13 14 15 
     * A kitten in square 11 could only move up, down, or left (not right). 
     * A kitten in square 13 could only move left, up, or right (not down). 
     * A kitten in square 0 could only move right or down (not left or up).
     *
     * Return the the kitten's new square as a single integer using the formula,
     * currRow * numCols + numCols
     */
    public int move() {
    		while (!isValidDirection(row, col, dir)) {
    			int dir = (int)(Math.random() * 4);
    		}
    		if (dir == 0) {
    			row = row + 1;
    		} else if (dir == 1) {
    			col = col - 1;
    		} else if (dir == 2) {
    			row = row - 1;
    		} else {
    			col = col + 1;
    		}

        return currRow * numCols + numCols;
    }
    
    private boolean isValidDirection(row, col, dir) {
    		if (dir == 0) {
			return (row + 1) < numRows;
		} else if (dir == 1) {
			return (col - 1) >= 0;
		} else if (dir == 2) {
			return (row - 1) >= 0;
		} else {
			return (col + 1) < numCols;
		}
    }
}
