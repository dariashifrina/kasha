import cs1.Keyboard;
public class Woo{
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
	Board.addTrain(bean, 9, 0);
	Board.printb(bean);
	    
 
	System.out.println("Enter 'up' to move one unit up.");
	String clive = Keyboard.readWord();
	Board.moveUp(bean, 9,1);
       	System.out.println("You have moved one unit up.");
	Board.printb(bean);
	
    }
}
