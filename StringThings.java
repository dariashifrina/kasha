public class StringThings{
    public static String alphaBet= "abcdefghijklmnopqrstuvwxyz";
    public static String[] randomWords = {"cat","dog","shovel","food","ring","awesome","KtS","cool", "idk", "savvy", "groovy", "moose",
														"nice", "perhaps", "please", "train", "muppet"};
    

    public static String[] confuse{"up", "down", "left", "down"};

    public static String word(int length){
    String retString = "";
    for (int i = 0; i < length; i ++){ 
	int numberPicked = (int)(Math.random() * 26);
	retString += alphaBet.substring(numberPicked, numberPicked + 1);
    }
    return retString;
    }

    public static String easyWord(){
	int numberPicked = (int)(Math.random() * randomWords.length);
	return randomWords[numberPicked];
    }
 
   public static String confuse(){
       int numberPicked = (int)(Math.Random() * confuse.length);
       return confuse[numberPicked];
   }
	
}
