public class StringThings{
    public static String alphaBet= "abcdefghijklmnopqrstuvwxyz";
    public static String word(int length){
    String retString = "";
    for (int i = 0; i < length; i ++){ 
	int numberPicked = (int)(Math.random() * 26);
	retString += alphaBet.substring(numberPicked, numberPicked + 1);
    }
    return retString;
    }
    
}
