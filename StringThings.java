public class StringThings{
    public static String alphaBet= "abcdefghijklmnopqrstuvwxyz";
    public static String[] randomWords = {"cat","dog","shovel","food","ring","awesome","KtS","cool", "idk", "savvy", "groovy", "moose", "apcs", "topher", "shenanigan", "skedaddle", "atmosphere", "logic", "canonical", "salient", "ferocious", "fibonacci", "cocoon", "horseradish" , "propaganda", "amicable", "conundrum", "hackneyed", "intrepid", "opulent", "spontaneous", "wary",  
														"nice", "perhaps", "please", "train", "muppet"};
    

    public static String[] confuse = {"up", "down", "left", "down", "east", "west", "north", "south"};

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
       int numberPicked = (int)(Math.random() * confuse.length);
       return confuse[numberPicked];
   }
	
}
