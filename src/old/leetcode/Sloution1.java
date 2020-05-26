package old.leetcode;

public class Sloution1 {
    public boolean detectCapitalUse(String word) {
        boolean upper = true;
        boolean lower = true;
        for (int i = 1; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                lower = false;
            }
            if(Character.isLowerCase(word.charAt(i))){
                upper = false;
            }
        }
        if(Character.isUpperCase(word.charAt(0))){
            if(lower || upper){
                return true;
            }
        }
        if(Character.isLowerCase(word.charAt(0))){
            if(lower){
                return true;
            }
        }
        return false;
    }
}
