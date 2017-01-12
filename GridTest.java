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
  public String toString(){
	String returnString = "";
	System.out.println(" ___ ___ ___ ___ ___ ___ ___");
	for (int x=0; x < this.size(); x++) {
	    for(int i =0; i < this.get(0).size(); < i++){
	    returnString += "|___";
	}
	    returnString += "|\n";
    }    

    public static void main(String[] args){
	//Object[][] n = new Object[3][3];
	Object[][] board = new ArrayList[3][3];
	/*	for(int i=0; i< 3; i++){
	    for(int x =0; x < 3; x++){
		board[i][x] = "|____|";
	    }
	    }*/
	System.out.println(board.toString());
    }
    
}

   
