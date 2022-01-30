class Solution {
    public boolean isPowerOfFour(int n) {
        
        int m = n;
        for(int i = 0 ; i < 31 ; i++)
        {
            
            if(Math.pow(4, i)==m)
            {
                return true  ;
            }
        
        }
       // else
       // {
            return false ;
      //  }
    }
}