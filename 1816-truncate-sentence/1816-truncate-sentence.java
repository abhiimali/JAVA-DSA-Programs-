class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] str = s.split(" ");
        String ans = "";
        // StringBuilder sb = new StringBuilder() ;
        int i = 0; 
        
        while( i < k)
        {
            ans += str[i] ;
            ans +=  " ";
            i++ ;
           
        }
        
        return ans.substring(0,ans.length()  - 1); 
        
    }
}