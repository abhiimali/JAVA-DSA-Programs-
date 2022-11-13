class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.trim().split("\\s+");
        String res = "";
        
        for(int i=words.length-1; i>=0; i--)
        {
            res = res + words[i];
            if(i!=0)
                res = res + " ";
        }
        return res;
        
    }
}