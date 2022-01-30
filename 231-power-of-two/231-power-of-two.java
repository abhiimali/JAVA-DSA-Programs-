class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int m = n;
        for(int i = 0 ; i < 31 ; i++)
        {
            
            if(Math.pow(2, i)==m)
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