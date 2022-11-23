class Solution {
    public int countVowelSubstrings(String word) {
    
       int   n = word.length();
        int ans  = 0;
        for(int i=0 ; i < n - 4 ; i++)
        {
            HashSet<Character> set = new HashSet<>();
            
            for(int j = i ; j < n ; j++)
            {
                if(!isVowel(word.charAt(j)) ) break ;
                 
                 else
                    
                   {
                       set.add(word.charAt(j));
                       if(set.size() >= 5)
                       {
                           ans++;
                       }
                   }
                
            }
            
            
        }
        
                   return ans ;
    }
    
    
    private boolean isVowel(char  c)
    {
     
                return c=='a'||c=='i'||c=='o'||c=='u'||c=='e';

        
    }
    
    
}