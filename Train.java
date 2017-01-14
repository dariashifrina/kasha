public class Train{
    private int xcor = 0;
    private int ycor = 0;
    private int numPickedUp = 0;
    public String colorStart = "\u001B[32m"; //GREEN
    public String colorEnd = "\u001B[0m";
    
    public String toString(){
	return "|_" + colorStart + "@" + colorEnd + "_";
    }
    public void setCords(int x, int  y){
	xcor = x;
	ycor = y;
    }
    public  int getXcor(){
	return xcor;}
    
    public int getYcor(){
	return ycor;
    }
    public void inP(){
	numPickedUp += 1;
    }
    public int getP(){
	return numPickedUp;
    }
}