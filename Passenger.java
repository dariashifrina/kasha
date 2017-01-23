public class Passenger extends BoardPlayers{
    //sets color of passenger toString to red
    public String colorStart = "\u001B[31m";
    public String colorEnd = "\u001B[0m";

    public String getColorStart(){
	return colorStart;
    }
    public Passenger(int x, int y){
	xcor = x;
	ycor = y;
    }
}
