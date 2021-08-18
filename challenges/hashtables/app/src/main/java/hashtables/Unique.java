package hashtables;

import java.util.Locale;

public class Unique {

    public boolean isUnique(String inputString){
        Hashtable<Character,Character> hashtable = new Hashtable<>();
        inputString = inputString.toLowerCase(Locale.ROOT);
        inputString = inputString.replaceAll("\\s","");
        for (int i=0;i<inputString.length();i++){
            if (hashtable.contains(inputString.charAt(i))){
                return false;
            }
            hashtable.add(inputString.charAt(i),inputString.charAt(i));
        }
        return true;
    }
}
