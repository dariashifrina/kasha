import cs1.Keyboard;
public class Woo{
    //public static int level = 1;                                                  
    public static String clearScreen = "\u001b[2J\u001b[H";

    public static void game(Board boardy, int difficulty){
	String up ="";
	String down = "";
	String left ="";
	String right = "";
        boardy.addTerminal();
        boardy.addTrain();
	boardy.setTime( difficulty * 20 + 40);
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
        else {
	    System.out.println("Looks like you've mispelled a word! You have a 5 second time deduction.");
	    boardy.setStartTime(boardy.getStartTime() - 4000);
        }       
       
	if(difficulty == 1){
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

        if  (difficulty > 3 && difficulty <= 5){
		up = StringThings.easyWord();
		down = StringThings.hardWord();
		while ( down.equals(up) ) {
		    down = StringThings.hardWord();}
		left = StringThings.hardWord();
		while (left.equals(up) || left.equals(down)){
		    left = StringThings.hardWord();
		}
    		right = StringThings.hardWord();
		while (right.equals(up) || right.equals(left) || right.equals(down)){
		    right = StringThings.hardWord();
		}
	}

	if (difficulty == 2 || difficulty == 3){
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
        public static void gamePlay(Board boardy){
            int n = 1;
            String gameStatus;
	    
	    while(boardy.getLost() == false){

		 game(boardy, n);
		 if(boardy.me.getP() == boardy.getPpl() && boardy.onTime()){
        System.out.println("You delivered passengers on time and go to the terminal! Good job.");
                n+=1;
                Board newGame2 = new Board(boardy.getCols() +  1, boardy.getRows() + 1);
                boardy = newGame2;
		}
		else {
		    boardy.setLost(true);}
	}
        System.out.println("You ran out of time! Would you like to play again? (Enter 'yes'or 'no')");
        gameStatus = Keyboard.readWord();
        if (gameStatus.equals("yes")){
             Board newGame2 = new Board(boardy.getCols(), boardy.getRows());
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
        System.out.println("Your train and position on the board is \033[94m@\u001B[0m .");
	System.out.println("Words corresponding up,down,left and right must be typed correctly to move in the respective direction. \n You will also have a limited amount of time to complete each level. \n If you misspell a word, you will suffer a 5 second deduction.");
        System.out.println("Type 'start' to see your board");
	String Rick = Keyboard.readWord();
	
                                                                     
        Board newGame = new Board(5, 5);
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



