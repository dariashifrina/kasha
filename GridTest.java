
public class GridTest{

  public static void populate(Object[][] a){
	String returnString = "";
	int cols = a.length;
	int rows = a[0].length;
	for(int top =0; top < cols; top ++){
	    returnString += " ___";
	}
	returnString += "\n";
	for (int x=0; x < rows; x++) {
	    for(int i =0; i < cols; i++){
	    a[x][i] = "|___";
	}
	    
	}
  }
    
    public static void printb(Object[][] b){
	int cols = b.length;
	int rows = b[0].length;
       	for(int top =0; top < cols; top ++){
	    System.out.print ( " ___");
	}
	System.out.print("\n");
	for(int c=0; c < cols; c++){
	    for(int r=0; r < rows; r++){
		System.out.print(b[c][r]);
	    }
	    System.out.print("|\n");
	}
    }

    public static void addPerson(Object[][] a, int xcor, int ycor){
	Passenger bob = new Passenger();
	bob.setCords(xcor, ycor);
	a[xcor][ycor] = bob;
    }

  
		
    public static void main(String[] args){
	Object[][] board = new Object[10][10];
	populate(board);
	addPerson(board, 4, 2);
	addPerson(board, 5, 9);
	addPerson(board, 1, 1);
	addPerson(board, 9, 1);
        printb(board);
	
    }
}

   
