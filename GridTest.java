import java.util.ArrayList;

public class GridTest{
    /*public String toString(){
	String returnString = "";
	System.out.println(" ___ ___ ___ ___ ___ ___ ___");
	for (int x=0; x < this.length; x++) {
	    for(int i =0; i < [x].length; i++){
	    returnString += "|___";
	}
	    returnString += "|\n";
    }
	return returnString;
	}*/
  public static String toString(int[][] a){
	String returnString = "";
	int cols = a.length;
	int rows = a[0].length;
	for(int top =0; top < cols; top ++){
	    returnString += " ___";
	}
	returnString += "\n";
	for (int x=0; x < rows; x++) {
	    for(int i =0; i < cols; i++){
	    returnString += "|___";
	}
	    returnString += "|\n";
	}
	return returnString;
  }


    public static void main(String[] args){
	int[][] board = new int[20][10];
       	System.out.println(toString(board));
    }
}

   
