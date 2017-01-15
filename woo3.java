import cs1.Keyboard;
public class woo3{
    //public static int level = 1;                                                                  
    public static String clearScreen = "\u001b[2J\u001b[H";

    public static void game(Board2 boardy, int difficulty){
	long startTime = System.currentTimeMillis();
        boardy.addTerminal();
        boardy.addTrain();
        for(int passPlaced = 0; passPlaced < difficulty + 2; passPlaced++){
            boardy.addPerson((int)(Math.random() * boardy.getRows()), (int)(Math.random() * boardy.getRows()));
        }
        //boardy.addPerson(1, 1);
        //.addPerson(4,4);
        boardy.calcFastestPath();
        System.out.println(clearScreen + boardy + boardy.getFastestMoves());
        String Jim;
        while( !(boardy.getGameEnd()) || (boardy.me.getP() != boardy.getPpl())){
        Jim = Keyboard.readWord();
        if(Jim.equals("w")){
            boardy.moveUp();
            }
        if(Jim.equals("s")){
            boardy.moveDown();
            }
        if(Jim.equals("a")){
            boardy.moveLeft();
            }
        if(Jim.equals("d")){
            boardy.moveRight();
            }
        else{
                System.out.println(Jim + " is Not a valid move! Please enter 'u' for up, 'd' for down, 'l' for left or 'r' for right'");
        }       
        System.out.print(clearScreen + boardy + "\n" + " NUM PICKED UP: " + boardy.me.getP() + "  Num you need to pick upr=  " + boardy.getPpl() + "\n NUM STEPS YOU HAVE TAKEN: " + boardy.me.getM());

	}
    }
        public static void gamePlay(Board2 boardy){
            int n = 1;
            String gameStatus;
            while(boardy.getLost() == false){
                game(boardy, n);
                if(boardy.me.getM() <= boardy.getFastestMoves() ){
        System.out.println("You beat Rowdy Robot and delivered passengers in time! Good job.");
                n+=1;
                Board2 newGame2 = new Board2(boardy.getCols() +  1, boardy.getRows() + 1);
                boardy = newGame2;
            }
            else{
                boardy.setLost(true);
            }
            }
            System.out.println("You lost against Rowdy Robot. Would you like to play again?");
        gameStatus = Keyboard.readWord();
        if (gameStatus.equals("yes")){
             Board2 newGame2 = new Board2(boardy.getCols(), boardy.getRows());
                    boardy = newGame2;
                gamePlay(boardy);
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



