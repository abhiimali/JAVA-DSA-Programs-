class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
     
        
        int sumA = 0 , sumB=0;
        
        for(Integer i : aliceSizes)
        {
            sumA += i ;
        }
        
         
        for(Integer k : bobSizes)
        {
            sumB += k ;
        }
        
      //  System.out.println(sumB);
        int[] ans = new int[2];
        int target = (sumA-sumB)/2 ;
        
        for(int i=0 ;i <aliceSizes.length ; i++ )
        {

              for(int j=0; j <bobSizes.length ; j++ )
                     {
            
            
                        if(aliceSizes[i]==bobSizes[j]+target)
                             {
                                     ans[0]=aliceSizes[i];
                                     ans[1]=bobSizes[j];
                 
                                  }
                         }
        
        
          } 
        return ans ; 
    }
}