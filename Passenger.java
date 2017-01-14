public class Passenger{
    //sets color of passenger toString to red
    public static String colorStart = "\u001B[31m";
    public static String colorEnd = "\u001B[0m";
    private int xcor;
    private int ycor;
    
    public Passenger(int x, int y){
	//Board2.addPerson(this, x, y);
	xcor = x;
	ycor = y;
    }

    public String toString(){
	return "|_" + "%" + "_";
    }

    public void setCords(int x, int y){
	xcor = x;
	ycor = y;
    }


    public static void main(String[] args){
	Board2.addPerson(this, xcor, ycor);
    }
}