class Solution {
    public String reverseOnlyLetters(String s) {
        
        
        char[] ch = s.toCharArray();
        int i=0; int j = ch.length - 1 ;
        
        while(i < j)
        {
            if(!Character.isAlphabetic(ch[i])) i++ ;
            else if(!Character.isAlphabetic(ch[j])) j-- ;
            else
            { char temp = ch[i] ;
                ch[i] = ch[j] ;
                ch[j] = temp ;
             i++;
             j--;
            }
        
        }
        return new String(ch);
    }
}