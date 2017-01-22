public class StringThings{
    public static String alphaBet= "abcdefghijklmnopqrstuvwxyz";
    public static String[] randomWords = {"cat","dog","shovel","food","ring","awesome","KtS","cool", "idk", "savvy", "groovy", "moose", "apcs", "topher", "logic",  "cocoon" , "amicable", "intrepid", "opulent", "wary", "fear", "love", "sloth", "potato", "ghost", "star", "harambe", "meme", "stuy", "study", "apple", "nice", "perhaps", "please", "train", "muppet"};
    
    public static String[] hardWords = {"ferocious", "spontaneous", "shenanigan","hackneyed","horseradish", "fibonacci", "ferocious", "atmosphere", "shenanigan", "skeddadle", "canonical", "supercalifragilisticexpialidocious", "attachment","compassionate", "antifederalism", "carpetbaggers", "transcendentalism", "conundrum", "propaganda", "awesome", "salient", "propaganda" };

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

    public static String hardWord(){
	int numberPicked = (int)(Math.random() * hardWords.length);
	return hardWords[numberPicked];
    }
 
   public static String confuse(){
       int numberPicked = (int)(Math.random() * confuse.length);
       return confuse[numberPicked];
   }
	
}
