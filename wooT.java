import cs1.Keyboard;
public class wooT{
    //public static int level = 1;                                                  
    public static String clearScreen = "\u001b[2J\u001b[H";

    public static void game(Board2 boardy, int difficulty){
	String up ="";
	String down = "";
	String left ="";
	String right = "";
        boardy.addTerminal();
        boardy.addTrain();
	boardy.setTime(30 * difficulty);
	for(int passPlaced = 0; passPlaced < difficulty + 2; passPlaced++){
            boardy.addPerson((int)(Math.random() * boardy.getRows()), (int)(Math.random() * boardy.getRows()));
	}
	long StartTime;
       	System.out.println(clearScreen + "LEVEL " + difficulty + "\n" + boardy);

	System.out.println("Enter 'ok' to begin");
	StartTime = System.currentTimeMillis();
	boardy.setStartTime(StartTime);
        while( boardy.getGameEnd() == false && boardy.onTime() ){
	String Jim = Keyboard.readWord();    
 		/*if(difficulty <=5){
		up = StringThings.easyWord(difficulty);
		down = StringThings.easyWord(difficulty);
		left = StringThings.easyWord(difficulty);
		right = StringThings.easyWord(difficulty);
	}
        if(difficulty > 5){
		up = StringThings.word(difficulty);
		down = StringThings.word(difficulty);
		left = StringThings.word(difficulty);
		right = StringThings.word(difficulty);
	    }*/
	
	System.out.println("\n SECONDS LEFT: " + boardy.timeLeft());
	
        if(Jim.equals(up)){
            boardy.moveUp();
            }
        if(Jim.equals(down)){
            boardy.moveDown();
            }
        if(Jim.equals(left)){
            boardy.moveLeft();
            }
        if(Jim.equals(right)){
            boardy.moveRight();
            }
	else if ( Jim.equals("ok")){ }
        else{
                System.out.println("\n\n\n\n" + Jim + " is Not a valid move! Please try again");
        }       
        if(difficulty <=3){
		up = StringThings.easyWord();
		down = StringThings.easyWord();
		while ( down.equals(up) ) {
		    down = StringThings.easyWord();}
		left = StringThings.easyWord();
		while (left.equals(up) || left.equals(down)){
		    left = StringThings.easyWord();
		}
    		right = StringThings.easyWord();
		while (right.equals(up) || right.equals(left) || right.equals(down)){
		    right = StringThings.easyWord();
		}
	}

	if (difficulty > 3 && difficulty <= 5){
	
	    up = StringThings.confuse();
	    while (up.equals("up")){
		  up = StringThings.confuse();
	    }
	    down= StringThings.confuse();
	    while (down.equals("down")){
		down= StringThings.confuse();
	    }
	    left = StringThings.confuse();
	    while (left.equals("left")){
		left = StringThings.confuse();
	    }
	    right = StringThings.confuse();
	    while (right.equals("right")){
		    right = StringThings.confuse();
		}
	    while ( down.equals(up) ) {
		    down = StringThings.confuse();
	    }
	   while (left.equals(up) || left.equals(down)){
		    left = StringThings.confuse();
		}
	    while (right.equals(up) || right.equals(left) || right.equals(down)){
		    right = StringThings.confuse();
		}





	}
		
		
	    
	
        if(difficulty > 5){
		up = StringThings.word(difficulty);
		down = StringThings.word(difficulty);
		left = StringThings.word(difficulty);
		right = StringThings.word(difficulty);
	    }

	System.out.print(clearScreen + "LEVEL " + difficulty + "\n" + boardy + "\n" + "NUM PICKED UP: " + boardy.me.getP() + "\nPASSENGERS LEFT: " + (boardy.getPpl() - boardy.me.getP()));
	System.out.println("\n\n        UP: " + up);
	System.out.println("LEFT: " + left + "     RIGHT: " + right);
	System.out.println( "    DOWN: " + down );
	System.out.println("\n TIME LEFT: " + boardy.timeLeft());
	}
	System.out.println("UH OH!");
    }
        public static void gamePlay(Board2 boardy){
            int n = 1;
            String gameStatus;
	    
	    while(boardy.getLost() == false){

		 game(boardy, n);
		 if(boardy.me.getP() == boardy.getPpl() && boardy.onTime()){
        System.out.println("You delivered passengers on time and go to the terminal! Good job.");
                n+=1;
                Board2 newGame2 = new Board2(boardy.getCols() +  1, boardy.getRows() + 1);
                boardy = newGame2;
		}
		else {
		    boardy.setLost(true);}
	}
        System.out.println("You ran out of time! Would you like to play again?");
        gameStatus = Keyboard.readWord();
        if (gameStatus.equals("yes")){
             Board2 newGame2 = new Board2(boardy.getCols(), boardy.getRows());
                    boardy = newGame2;
                gamePlay(boardy);
        }
	else {
	    System.out.println("Thanks for playing!");
	    System.exit(0);
	}
       
        }

    public static void main(String[] args){
        System.out.println("Welcome to Tardy Terminal! Enter your name to continue...");
        System.out.println("your job as a train conductor is to pick up the passengers.");
        System.out.println("On your board, they are represented as \u001B[31m%\u001B[0m .");
        System.out.println("Your train and position on the board is \u001B[32m@\u001B[0m .");
        System.out.println("Here's your grid, populated with some people:\n");
                                                                     
        Board2 newGame = new Board2(5, 5);
        gamePlay(newGame);
       /*if(newGame.me.getM() == newGame.getFastestMoves() ){
        System.out.println("You beat Rowdy Robot and delivered passengers in time! Good job.");
        newGame.setGameEnd(false);
        game(newGame, 2);
       }
       else{
        System.out.println("You lost against Rowdy Robot. Press enter to play again!");
        game(newGame, 1);
       }*/
    }
}



