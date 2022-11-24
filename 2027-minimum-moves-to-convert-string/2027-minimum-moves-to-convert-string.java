class Solution {
    public int minimumMoves(String s) {
        
        int count = 0 ;
        
        
        int n = s.length();
        int i=0 ;
        while(i < n )
            
        {
            if(s.charAt(i)=='X')
            {
                count++ ;
                i=i+3 ;
            }
            else
            {
                i++;
            }
            
            
        }
        return count ;
        
        
    }
}