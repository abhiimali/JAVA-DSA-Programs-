class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int windowStart = 0 ;
        int windowEnd = 0 ;
        int result = 0 ;
        
        HashSet<Character> charSet=new HashSet<Character>();

        
        for( windowEnd = 0 ; windowEnd < s.length() ; windowEnd++)
        {
            while(charSet.contains(s.charAt(windowEnd)))
            {
                
                 charSet.remove(s.charAt(windowStart));
                
                windowStart++;
                
                
            }
            
             charSet.add(s.charAt(windowEnd));
            
              result = Math.max(result,windowEnd-windowStart+1);
              
               
                    
          
        }
        
            return result ;
    }
}