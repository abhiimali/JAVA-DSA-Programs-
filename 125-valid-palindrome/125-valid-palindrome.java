class Solution {
    public boolean isPalindrome(String s) {
        
        
//          Logic 
        
//         1. Use Regular Expression For Converting removing alphanumeric values 
            
//             And then do lower Case ;
            
//             [^a-zA-Z0-9]
             
//         2. Now Loop Through String 
            
       
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
            int  left=0;
            int right=s.length()-1;
        
        while( left < right) 
        {
             if(s.charAt(left) != s.charAt(right))
             {
                 return false ;
             }
            
            left++;
            right--;
            
        }

        return true ;
        
    }
}