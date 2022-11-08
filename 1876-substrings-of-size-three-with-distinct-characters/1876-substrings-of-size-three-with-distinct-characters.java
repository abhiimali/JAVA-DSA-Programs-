class Solution {
    public int countGoodSubstrings(String s) {
     
        int i=0 ;
        
        int j= 1 ;
        int k = 2 ;
        
        int n = s.length();
        
        int count = 0 ;
        while(k < n)
        {
            
            if(s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && 
          s.charAt(k) != s.charAt(i))
            {
                count++ ;
            }
            
            i++ ;
            j++ ;
            k++ ;
            
        }
        return count ;
        
    }
}