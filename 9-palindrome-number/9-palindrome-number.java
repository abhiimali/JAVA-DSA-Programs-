class Solution {
    public boolean isPalindrome(int x) {
        
        
        int temp =  x ;
        
        int number = 0 , remainder  ;
        
        while(x > 0)
            
        {
            
            
            remainder  = x % 10 ;
            
            number = (number * 10 ) + remainder ;
            
            x = x  / 10 ;
            
            
        }
        
        if ( number == temp )
        {
            return true ;
            
        }
        else
        {
            return false ; 
        }
        
       // boolean ans  = (number==temp) ? true : false ;
       //  return ans  ;   
    }
}