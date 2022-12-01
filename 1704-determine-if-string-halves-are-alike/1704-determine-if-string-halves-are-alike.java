class Solution {
    public boolean halvesAreAlike(String s) {
        
        int n = s.length();
        int count=0;
        for(int i=0 ; i < n ; i++ )
        {   
               if(i < n/2 && isVowel(s.charAt(i)))
               {
                   count++;
               }
            else if(isVowel(s.charAt(i)))
            {
                  count -- ;
            }
                
        }
        return count==0 ;
    }
    
    public boolean isVowel(char c)
    {
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
    {    
        return true;
    }    
    else
    {
        return false;
    } 
    }
}