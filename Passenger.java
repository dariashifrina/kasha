public class Passenger{
    //sets color of passenger toString to red
    public static String colorStart = "\u001B[31m";
    public static String colorEnd = "\u001B[0m";
    private int xcor;
    private int ycor;
    
    public String toString(){
	return "|_" + colorStart + "%" + colorEnd + "_";
    }

    public void setCords(int x, int y){
	xcor = x;
	ycor = y;
    }
}