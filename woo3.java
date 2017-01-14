import cs1.Keyboard;
public class woo3{
    //public static int level = 1;                                                                  
    public static String clearScreen = "\u001b[2J\u001b[H";

    public static void main(String[] args){
        System.out.println("Welcome to Tardy Terminal! Enter your name to continue...");
        System.out.println("your job as a train conductor is to pick up the passengers.");
        System.out.println("On your board, they are represented as \u001B[31m%\u001B[0m .");
        System.out.println("Your train and position on the board is \u001B[32m@\u001B[0m .");
        System.out.println("Here's your grid, populated with some people:\n");

        //int dog = level * 6;                                                                      
        Board2 boardy = new Board2(5, 5);
        boardy.addTerminal();
        boardy.addTrain();
	    boardy.addPerson(1, 1);
	    boardy.addPerson(4,4);
        boardy.calcFastestPath();
        System.out.println(clearScreen + boardy + boardy.getFastestMoves());
        String Jim;
        while( !(boardy.getGameEnd()) || (boardy.me.getP() != boardy.getPpl())){
        Jim = Keyboard.readWord();
        if(Jim.equals("up")){
            boardy.moveUp();
	        }
        if(Jim.equals("down")){
            boardy.moveDown();
	        }
        if(Jim.equals("left")){
            boardy.moveLeft();
	        }
        if(Jim.equals("right")){
            boardy.moveRight();
	        }
	else{
	    System.out.println(Jim + " is Not a valid move! Please enter 'up', 'down', 'left' or 'right'");
	}
        System.out.print(clearScreen + boardy + "\n" + " NUM PICKED UP: " + boardy.me.getP() + " boardypp; = " + boardy.getPpl());
	}
    }
}



