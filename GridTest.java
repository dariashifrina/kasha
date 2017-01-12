import java.util.ArrayList;

public class GridTest{
  public static void populate(String[][] a){
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
    
    public static void printb(String[][] b){
	int cols = b.length;
	int rows = b[0].length;
	for(int c=0; c < cols; c++){
	    for(int r=0; r < rows; r++){
		System.out.print(b[c][r]);
	    }
	    System.out.print("|\n");
	}
    }
	   
		
	

    public static void main(String[] args){
	String[][] board = new String[20][20];
	populate(board);
	board[4][2] = "|_%_"; //this can represent a person
        printb(board);
    }
}

   
