public class timeTest{
    //-------------------------------------------------------
    //class timeTest: working with System.currentTimeMillis()
    //in search of a way to place time restrictions on levels
    //-------------------------------------------------------

    // prints "TIME'S UP" after n seconds
    public static void timeUp(int n){
	long David = System.currentTimeMillis();
	long Syd = 0;
        double secondsElapsed = 0;
	while(secondsElapsed < n){
     	    Syd =  System.currentTimeMillis();
	    secondsElapsed = ((Syd - David) / 1000.0);
    	}
       System.out.println("time elapsed : " + secondsElapsed);
       System.out.println("TIME'S UP!");
    }

    
    public static void main(String[] args){
	timeUp(5);
	timeUp(3);
    }
}