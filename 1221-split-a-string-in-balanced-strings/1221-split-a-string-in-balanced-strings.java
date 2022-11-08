class Solution {
    public int balancedStringSplit(String s) {
        
        
        int r = 0  ;
        int l=0;
        int ind = 0 ;
        
        int count = 0 ;
        int n = s.length() ;
        
        
        for(int i=0 ; i < n ; i++)
        {
           char ch = s.charAt(i) ;
            
            if(ch=='R')
            {
                r++;
            }
            else
            {
                l++;
            }
            
            if(Math.abs(r-l)==0)
            {
                count++ ;
            }
            
            
        }
        
        return count ;
    }
}