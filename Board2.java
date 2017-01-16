import java.util.ArrayList;

public class Board2{
    /*instance variables*/
    private boolean gameOver;
    private boolean lost;
    private int cols;
    private int rows;
    private Object[][] board;
    private  int ppl = 0;
    private ArrayList<Integer> passengerXCor;
    private ArrayList<Integer> passengerYCor;
    private int fastestMoves = 0;
    private int Time = 0;
    Train me = new Train();
    Terminal Teddy = new Terminal();


    public Board2(int cols2, int rows2){
    		gameOver = false;
    		lost = false;
		cols = cols2;
    		rows = rows2;
    		board = new Object[rows2][cols2];
    		passengerXCor = new ArrayList<Integer>();
    		passengerYCor = new ArrayList<Integer>();
    		populate();
    }
   /*public void reset(){
    		gameOver = false;
    		lost = false;
    		board = new Object[rows][cols];
    		passengerXCor = new ArrayList<Integer>();
    		passengerYCor = new ArrayList<Integer>();
    		populate();
   }*/
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
    if ((board[xcor][ycor] instanceof Passenger) || (board[xcor][ycor] instanceof Terminal) || (board[xcor][ycor] instanceof Train)){
    	addPerson((int) (Math.random()) * rows, (int) (Math.random() * cols));
	    }
	else{
    Passenger bob = new Passenger(xcor, ycor);
    board[xcor][ycor] = bob;
	bob.setCords(xcor, ycor);
	ppl += 1;
	passengerXCor.add(xcor);
	passengerYCor.add(ycor);
}
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
	   	if (board[x][y] instanceof Terminal){
		    if(me.getP() != ppl){
			System.out.println("PICK UP THE DARN PASSENGERS");
			return;
		    }
		gameOver = true; //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	    me.inM();
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
	   	if (board[x][y] instanceof Terminal){
		    if(me.getP() != ppl){
			System.out.println("PICK UP THE DARN PASSENGERS");
			return;
		    }
	       		gameOver = true; //increases counter of passengers by 1
		}
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	    me.inM();
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
	   	if (board[x][y] instanceof Terminal){
		    if(me.getP() != ppl){
			System.out.println("PICK UP THE DARN PASSENGERS");
			return;
		    }
		gameOver = true; //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	    me.inM();
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
	   	if (board[x][y] instanceof Terminal){
		    if(me.getP() != ppl){
			System.out.println("PICK UP THE DARN PASSENGERS");
			return;
		    }
		gameOver = true; //increases counter of passengers by 1
	    }
	    board[x][y] = me;
	    board[me.getXcor()][me.getYcor()] = "|___";
	    me.setCords(x, y);
	    me.inM();
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("You can't move that way!");
	}	
    }	
	
    public boolean getGameEnd(){
        return gameOver;
    }
    public void setGameEnd(boolean here){
        gameOver = here;
    }
    public int getPpl(){
	return ppl;
    }


    public void calcFastestPath(){
	int checkingXCor = me.getXcor();
	int checkingYCor = me.getYcor();
	for (int i = 0; i< ppl + 1; i++){ 
		if(i < ppl){
			fastestMoves += Math.abs(passengerXCor.get(i) - checkingXCor) + Math.abs(passengerYCor.get(i) - checkingYCor);
			checkingXCor = passengerXCor.get(i);
			checkingYCor = passengerYCor.get(i);
		}
		else{
			fastestMoves += Math.abs(Teddy.getXCor() - checkingXCor) + Math.abs(Teddy.getYCor() - checkingYCor);
		}
	}
}

public int getFastestMoves(){
	return fastestMoves;
}

public int getRows(){
	return rows;
}
public int getCols(){
	return cols;
}
public boolean getLost(){
	return lost;
} 
public void setLost(boolean here){
	lost = here;
}
public int boardGetM(){
	return me.getM();
}

public  int timeLeft(long StartTime){
    int n = Time;
    int secondsLeft;
        long Syd = 0;
        double secondsElapsed = 0;
        secondsLeft = n;
        Syd =  System.currentTimeMillis();
        secondsElapsed = ((Syd - StartTime) / 1000.0);
        secondsLeft = n - (int)secondsElapsed;  
	return secondsLeft;
    }

    public void setTime(int n){
	Time = n;
    }
    public void resetTime(){
	Time = 0;
    }

    
    public boolean onTime(long StartTime){
	return timeLeft(StartTime) > 0;
    } 
    
    public static void main(String[] args){
    }
}
