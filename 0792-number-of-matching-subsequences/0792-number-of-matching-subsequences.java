class Solution {
    public int numMatchingSubseq(String s, String[] words) {
     
        int ans = 0 ;
        
        HashMap<String ,Integer> map = new HashMap<>();
        
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        // String word:map.keySet()
        for( String word:map.keySet() )
        {
            int i=0;
            int  j = 0;
            
            while( i < s.length() && j < word.length())
            {
                if(s.charAt(i)==word.charAt(j))
                {
                    i++ ; j++ ;
                }
                else i++ ;
            }
            
            ans +=  (j==word.length()) ? map.get(word) : 0 ;
            
            
        }
        return ans ;
    }
}