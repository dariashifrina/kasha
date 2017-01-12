import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class GridTest{
    public static String colorStart = "\u001B[31m";
    public static String colorEnd = "\u001B[0m_";
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

    public static void addPerson(String[][] a, int xcor, int ycor){
	a[xcor][ycor] = "|_" + colorStart + "%" + colorEnd;
    }
   
    
		
    public static void main(String[] args){
	String[][] board = new String[10][10];
	populate(board);
	addPerson(board, 4, 2);
	addPerson(board, 5, 9);
	addPerson(board, 1, 1);
	addPerson(board, 9, 1);
        printb(board);
    }
}

   
