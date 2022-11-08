class Solution {
    public String removeOuterParentheses(String s) {
        
        int n = s.length();
        String str ="" ;
        int level = 0 ;
        for(int i=0 ;  i<n ; i++)
        {
          //  char ch = s.charAt(i);
            
            if( s.charAt(i) == '(')
            {
                level++;
            }
            if(level > 1)
            {
                str += s.charAt(i) ;
            }
            if(s.charAt(i) == ')')
            {
                
                level-- ;
            }
            
        }
        return str ; 
        
    }
}