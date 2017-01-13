public class Board{
/*instance variables*/
    int cols;
    int rows;
 
     public static void populate(Object[][] board){
	String returnString = "";
	int cols = board.length;
	int rows = board[0].length;
	for(int top =0; top < cols; top ++){
	    returnString += " ___";
	}
	returnString += "\n";
	for (int x=0; x < rows; x++) {
	    for(int i =0; i < cols; i++){
	    board[x][i] = "|___";
	}
	    
	}
  }
    
    public static void printb(Object[][] board){
	int cols = board.length;
	int rows = board[0].length;
       	for(int top =0; top < cols; top ++){
	    System.out.print ( " ___");
	}
	System.out.print("\n");
	for(int c=0; c < cols; c++){
	    for(int r=0; r < rows; r++){
		System.out.print(board[c][r]);
	    }
	    System.out.print("|\n");
	
	}
    }
    /*~~~~~~~~~~~~~~~~~~~ ADDING PASSENGERs ~~~~~~~~~~~~~~~~~~~
      includes: addTrain
      precond: slot is open for passenger.
      postcond: creates a "%" at the passenger's position.
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void addPerson (Object[][] board, int xcor, int ycor){
	Passenger bob = new Passenger();
	board[xcor][ycor] = bob;
    }
    /*~~~~~~~~~~~~~~~~~~~ ADDING TRAINs ~~~~~~~~~~~~~~~~~~~
      includes: addTrain
      precond: slot is open for train.
      postcond: creates a "@" at the train position.
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void addTrain(Object[][] board, int xcor, int ycor){
	Train Troy = new Train();
	Troy.setCords(xcor, ycor);
	board[xcor][ycor] = Troy;
    }

    /*~~~~~~~~~~~~~~~~~~~ MOVING METHODS ~~~~~~~~~~~~~~~~~~~
      includes: moveUp, moveDown, moveLeft, moveRight
      precond: don't try to move outside board.
      postcond: moves whatever is at the current slot to a new slot.
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void moveUp(Object[][] board, int xcor, int ycor){
	try{
	    Object sam = board[xcor][ycor];
	    board[xcor - 1][ycor] = sam;
	    board[xcor][ycor] = "|___";
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }
    public static void moveDown(Object[][] board, int xcor, int ycor){
	try{
	    Object sam = board[xcor][ycor];
	    board[xcor + 1][ycor] = sam;
	    board[xcor][ycor] = "|___";
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }
    public static void moveLeft(Object[][] board, int xcor, int ycor){
	try{
	    Object sam = board[xcor][ycor];
	    board[xcor][ycor - 1] = sam;
	    board[xcor][ycor] = "|___";
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }
    public static void moveRight(Object[][] board, int xcor, int ycor){
	try{
	    Object sam = board[xcor][ycor];
	    board[xcor][ycor + 1] = sam;
	    board[xcor][ycor] = "|___";
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");	
	}
    }

    public static void main(String[] args){
	Object[][] adam = new Object[10][10];
	populate(adam);
	addPerson(adam, 5, 6);
	addPerson(adam, 8, 2);
	addPerson(adam, 7, 9);
	System.out.println("========PEOPLE ADDED=======");
	printb(adam);
	System.out.println("=====TRAIN ADDED AT 9,0=======");
	addTrain(adam, 9, 0);
	printb(adam);
	System.out.println("=======TRAIN MOVED UP=========");
	moveUp(adam, 9 , 0);
	printb(adam);
	System.out.println("=======TRAIN MOVED DOWN=========");
	moveDown(adam, 8 , 0);
	printb(adam);
	System.out.println("=======TRAIN MOVED RIGHT=========");
	moveRight(adam, 9 , 0);
	printb(adam);
	System.out.println("=======TRAIN MOVED LEFT=========");
	moveLeft(adam, 9 , 1);
	printb(adam);
    }
}
