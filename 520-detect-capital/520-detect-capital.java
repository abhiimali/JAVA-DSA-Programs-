class Solution {
    public boolean detectCapitalUse(String word) {
         if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            return true;
        if((int)word.charAt(0) < 91) {
            for(int i=1; i<word.length(); i++) {
                if(word.charAt(i)<91)
                    return false;
            }
            return true;
        }
        
        return false;
    }
}