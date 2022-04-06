class Solution {
    public int lengthOfLastWord(String str) {
        
        if(str.isEmpty() || str.isBlank())
           return 0;
      String[] lastString = str.split(" ");
      String res = lastString[lastString.length - 1];
      return res.length();
        
    }
}