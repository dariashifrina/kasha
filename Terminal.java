public class Terminal{
	    //sets color of passenger toString to red
    public static String colorStart = "\u001B[35m";
    public static String colorEnd = "\u001B[0m";
    private int xcor;
    private int ycor;
    
    public String toString(){
	return "|_" + "$" + "_";
    }
    public int getXCor(){
        return xcor;
    }
    public int getYCor(){
        return ycor;
    }
    public void setCords(int x, int y){
	xcor = x;
	ycor = y;
    }
}