public class BoardPlayers{
    protected int xcor;
    protected int ycor;
    public String toString(){
	if(this.getClass().equals("Terminal")){
	    return "|_" + "$" + "_";
	}
	else if(this.getClass().equals("Train")){
	    return "|_" + "@" + "_";
	}
	else{
	    return "|_" + "%" + "_";
	}
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
