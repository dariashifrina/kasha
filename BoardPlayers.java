public class BoardPlayers{
    protected int xcor;
    protected int ycor;
    protected String appearance;
    public String toString(){
    	if(this instanceof Train){
    		return "|_" + "@" + "_";	
    	}
    	if(this instanceof Terminal){
    		return "|_" + "$" + "_";	
    	}
    	else{
    		return "|_" + "%" + "_";	
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
