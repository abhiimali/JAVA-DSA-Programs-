class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        int p = searchWord.length();
       // int i = 1 ;
        int ans = -1;
        
        String[] strArray = sentence.split("\\s+");
        int i=1;
        for(String str : strArray)
            
        { 
             
            if(str.length() < p )
        {    i++;
            continue ;
        }
            
            int n = str.length() ;
            if(str.substring(0,p).equals(searchWord))
            {
                ans = i ;
                return ans ;
            }
            
            i++;
            
        }
        
        return ans ;
    }
}