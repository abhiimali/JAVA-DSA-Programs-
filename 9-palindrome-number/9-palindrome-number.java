class Solution {
    public boolean isPalindrome(int a) {
        
        
        
        int temp = a ;

        int r , sum = 0 ;


        while ( a > 0 )
        {
             r  = a % 10 ;
             sum = (sum *10) + r ;
             a =a/10 ;

        }
        if (temp==sum)
        {

           /// System.out.println(" Palindrome ");
            return true ;
        }
        else
        {
            return false ;
        }
    }
}