class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int p = pref.length();
        int count = 0 ;
        
        for(String str : words)
            
        { 
            
            if(str.length() < p )
        {
            continue ;
        }
            
            int n = str.length() ;
            if(str.substring(0,p).equals(pref))
            {
                count++ ;
            }
            
            
            
        }
        
        return count ;
    }
}