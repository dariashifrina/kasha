import cs1.Keyboard;
public class Woo{
    public static String clearScreen = "\u001b[2J\u001b[H";
    public static void main(String[] args){
        System.out.println("Welcome to Tardy Terminal! Enter your name to continue...");
	String jim = Keyboard.readWord();
	System.out.println(jim + ", job as a train conductor is to pick up the passengers.");
	System.out.println("On your board, they are represented as \u001B[31m%\u001B[0m .");
        System.out.println("Your train and position on the board is \u001B[32m@\u001B[0m .");
	System.out.println("Enter ok to continue...");
	String oboe = Keyboard.readWord();
       	System.out.println("Here's your grid, populated with some people:\n");


	Object[][] bean = new Object[10][10];
	Board.populate(bean);
	Board.addPerson(bean, 5, 6);
	Board.addPerson(bean, 8, 2);
	Board.addPerson(bean, 7, 9);
	Train dad = new Train();
	Board.addTrain(bean, dad, 9, 0);
	Board.printb(bean);
	String adam = "";
	while(adam != "end"){
	    adam = Keyboard.readWord();
		System.out.println(clearScreen);
		Board.moveUp(bean, dad, dad.getXcor(), dad.getYcor());
		Board.printb(bean);}
    }
}
	    
	
	/*System.out.println("Enter 'up' to move one unit up.");
	String clive = Keyboard.readWord();
	System.out.println(clearScreen);
	Board.moveUp(bean, 9,0);
       	System.out.println("You have moved one unit up.");
	Board.printb(bean);
	
	System.out.println("Enter 'right' to move one unit left.");
	String goat = Keyboard.readWord();
	System.out.println(clearScreen);
	Board.moveRight(bean, 8,0);
       	System.out.println("You have moved one unit right.");
	Board.printb(bean); */

