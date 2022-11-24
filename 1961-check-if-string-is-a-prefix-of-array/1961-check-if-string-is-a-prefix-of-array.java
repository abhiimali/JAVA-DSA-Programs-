class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        String str = "";
        
        for(String word : words)
        
        {
            str = str + word ;
            if(str.startsWith(s) && s.length() >= str.length() )
            {
                return true ;
            }
            
            
        }
        
        return false ;
    }
}