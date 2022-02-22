class Solution {
    public int titleToNumber(String columnTitle) {
        
        int ans = 0 ;
        
        for( char c : columnTitle.toCharArray())
        {
            
            int d = c - 'A' + 1 ;
            
            ans = ans *26+d;
            
        }
        
        return ans ;
    }
}