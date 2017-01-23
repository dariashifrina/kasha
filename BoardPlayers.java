public class BoardPlayers{
    protected int xcor;
    protected int ycor;
    protected String appearance;
    public String toString(){
    	if(this instanceof Train){
    		return "|_" + "\033[94m@\u001B[0m" + "_";	
    	}
    	if(this instanceof Terminal){
    		return "|_" + "\u001B[35m$\u001B[0m" + "_";	
    	}
    	else{
    		return "|_" + "\u001B[31m%\u001B[0m" + "_";	
    	}
    	//return appearance;
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
