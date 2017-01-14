public class Board2{
    /*instance variables*/
    private int cols;
    private int rows;
    private Object[][] board;
    Train me = new Train();
    Terminal Teddy = new Terminal();


    public Board2(int cols2, int rows2){
    	    cols = cols2;
    		rows = rows2;
    		board = new Object[rows2][cols2];
    		populate();
    }
   public void populate(){
/*	String returnString = "";
	for(int top =0; top < cols; top ++){
	    returnString += " ___";
	}
	returnString += "\n";*/
	for (int x=0; x < rows; x++) {
	    for(int i =0; i < cols; i++){
	    board[x][i] = "|___";
	}
  }
}
   public String toString(){
   	String returnString = "";
	//int cols = board.length;
	//int rows = board[0].length;
       	for(int top =0; top < cols; top ++){
	    returnString += " ___";
	}
	returnString +="\n";
	for(int c=0; c < rows; c++){
	    for(int r=0; r < cols; r++){
		returnString += board[c][r];
	    }
	    returnString += "|\n";
	
	}
	return returnString;
    }

    /*~~~~~~~~~~~~~~~~~~~ ADDING PASSENGERs ~~~~~~~~~~~~~~~~~~~
      includes: addTrain
      precond: slot is open for passenger.
      postcond: creates a "%" at the passenger's position.
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
   public void addPerson (int xcor, int ycor){
	Passenger bob = new Passenger();
	board[xcor][ycor] = bob;
    }

    /*~~~~~~~~~~~~~~~~~~~ ADDING TRAINs ~~~~~~~~~~~~~~~~~~~
      includes: addTrain
      precond: slot is open for train.
      postcond: creates a "@" at the train position.
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void addTrain(){
	board[rows - 1][0] = me;
	me.setCords(rows - 1, 0);
    }
    
    public void addTerminal(){
	board[0][cols - 1] = Teddy;
	Teddy.setCords(0, cols - 1);
    }

    /*~~~~~~~~~~~~~~~~~~~ MOVING TRAIN METHODS ~~~~~~~~~~~~~~~~~~~
      includes: moveUp, moveDown, moveLeft, moveRight
      precond: don't try to move outside board.
      postcond: moves whatever is at the current slot to a new slot.
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void moveUp(){
	int x = me.getXcor() - 1;
	int y = me.getYcor();
	try{
	     if (board[x][y] instanceof Passenger){
		me.inP(); //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }	


    //MOVE DOWN
    public void moveDown(){
	int x = me.getXcor() + 1;
	int y = me.getYcor();
	try{
	     if (board[x][y] instanceof Passenger){
		me.inP(); //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }	
	

    //MOVE RIGHT
    public void moveRight(){
	int x = me.getXcor();
	int y = me.getYcor() + 1;
	try{
	    if (board[x][y] instanceof Passenger){
		me.inP(); //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }	
	
    //MOVE LEFT
        public void moveLeft(){
	int x = me.getXcor();
	int y = me.getYcor() - 1;
	try{
	     if (board[x][y] instanceof Passenger){
		me.inP(); //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }	
	
    


    public static void main(String[] args){
	Board2 adam = new Board2(4,4);
	adam.addPerson(3,0);
	System.out.print(adam);
    }
}